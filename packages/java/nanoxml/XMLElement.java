package nanoxml;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XMLElement {
  static final long serialVersionUID = 6685035139346394777L;

  public static final int NANOXML_MAJOR_VERSION = 2;

  public static final int NANOXML_MINOR_VERSION = 2;

  private Hashtable attributes;

  private Vector children;

  private String name;

  private String contents;

  private Hashtable entities;

  private int lineNr;

  private boolean ignoreCase;

  private boolean ignoreWhitespace;

  private char charReadTooMuch;

  private Reader reader;

  private int parserLineNr;

  public XMLElement() {
    this(new Hashtable(), false, true, true);
  }

  public XMLElement(boolean skipLeadingWhitespace, boolean ignoreCase) {
    this(new Hashtable(), skipLeadingWhitespace, true, ignoreCase);
  }

  public XMLElement(Hashtable entities) {
    this(entities, false, true, true);
  }

  public XMLElement(boolean skipLeadingWhitespace) {
    this(new Hashtable(), skipLeadingWhitespace, true, true);
  }

  public XMLElement(Hashtable entities, boolean skipLeadingWhitespace) {
    this(entities, skipLeadingWhitespace, true, true);
  }

  public XMLElement(Hashtable entities, boolean skipLeadingWhitespace, boolean ignoreCase) {
    this(entities, skipLeadingWhitespace, true, ignoreCase);
  }

  protected XMLElement(Hashtable entities, boolean skipLeadingWhitespace, boolean fillBasicConversionTable, boolean ignoreCase) {
    this.ignoreWhitespace = skipLeadingWhitespace;
    this.ignoreCase = ignoreCase;
    this.name = null;
    this.contents = "";
    this.attributes = new Hashtable();
    this.children = new Vector();
    this.entities = entities;
    this.lineNr = 0;
    Enumeration en = this.entities.keys();
    while (en.hasMoreElements()) {
      Object key = en.nextElement();
      Object value = this.entities.get(key);
      if (value instanceof String) {
        value = ((String)value).toCharArray();
        this.entities.put(key, value);
      }
    }
    if (fillBasicConversionTable) {
      this.entities.put("amp", new char[] { '&' });
      this.entities.put("quot", new char[] { '"' });
      this.entities.put("apos", new char[] { '\'' });
      this.entities.put("lt", new char[] { '<' });
      this.entities.put("gt", new char[] { '>' });
    }
  }

  public void addChild(XMLElement child) {
    this.children.addElement(child);
  }

  public XMLElement addChild(String name) {
    XMLElement xml = new XMLElement(true, false);
    xml.setName(name);
    addChild(xml);
    return xml;
  }

  public XMLElement addChild(String name, String value) {
    XMLElement xml = addChild(name);
    xml.setContent(value);
    return xml;
  }

  public void setAttribute(String name, Object value) {
    if (this.ignoreCase)
      name = name.toUpperCase();
    this.attributes.put(name, value.toString());
  }

  public void addProperty(String name, Object value) {
    setAttribute(name, value);
  }

  public void setIntAttribute(String name, int value) {
    if (this.ignoreCase)
      name = name.toUpperCase();
    this.attributes.put(name, Integer.toString(value));
  }

  public void addProperty(String key, int value) {
    setIntAttribute(key, value);
  }

  public void setDoubleAttribute(String name, double value) {
    if (this.ignoreCase)
      name = name.toUpperCase();
    this.attributes.put(name, Double.toString(value));
  }

  public void addProperty(String name, double value) {
    setDoubleAttribute(name, value);
  }

  public int countChildren() {
    return this.children.size();
  }

  public Enumeration enumerateAttributeNames() {
    return this.attributes.keys();
  }

  public Enumeration enumeratePropertyNames() {
    return enumerateAttributeNames();
  }

  public Enumeration enumerateChildren() {
    return this.children.elements();
  }

  public Vector getChildren() {
    try {
      return (Vector)this.children.clone();
    } catch (Exception e) {
      return null;
    }
  }

  public XMLElement getChild(String name) {
    for (Enumeration en = this.children.elements(); en.hasMoreElements(); ) {
      XMLElement el = en.nextElement();
      if (el.getName().equals(name))
        return el;
    }
    return null;
  }

  public XMLElement getChildOrNew(String name) {
    XMLElement c = getChild(name);
    if (c == null)
      c = addChild(name);
    return c;
  }

  public int getChildCount(String name) {
    int cnt = 0;
    for (Enumeration en = this.children.elements(); en.hasMoreElements(); ) {
      XMLElement el = en.nextElement();
      if (el.getName().equals(name))
        cnt++;
    }
    return cnt;
  }

  public XMLElement getChild(String name, String attrValue) {
    for (Enumeration en = this.children.elements(); en.hasMoreElements(); ) {
      XMLElement el = en.nextElement();
      String elAttrValue = el.getStringAttribute("name");
      if (el.getName().equals(name) && (attrValue == elAttrValue || attrValue.equals(elAttrValue)))
        return el;
    }
    return null;
  }

  public XMLElement getChild(String name, Map equalAttributesNameValue) {
    Enumeration en;
    label20: for (en = this.children.elements(); en.hasMoreElements(); ) {
      XMLElement el = en.nextElement();
      if (el.getName().equals(name)) {
        for (Iterator i = equalAttributesNameValue.entrySet().iterator(); i.hasNext(); ) {
          Map.Entry atrNameValue = i.next();
          String attrValue = el.getStringAttribute((String)atrNameValue.getKey());
          if (atrNameValue.getValue() == null) {
            if (attrValue != null)
              continue label20;
            continue;
          }
          if (!atrNameValue.getValue().equals(attrValue))
            continue label20;
        }
        return el;
      }
    }
    return null;
  }

  public int getChildInteger(String name, int defaultValue) {
    XMLElement xml = getChild(name);
    if (xml == null)
      return defaultValue;
    try {
      return Integer.parseInt(xml.getContent());
    } catch (NumberFormatException e) {
      return defaultValue;
    }
  }

  public String getChildString(String name, String defaultValue) {
    XMLElement xml = getChild(name);
    if (xml == null)
      return defaultValue;
    String v = xml.getContent();
    if (v == null || v.length() == 0)
      return defaultValue;
    return v;
  }

  public String getContents() {
    return getContent();
  }

  public String getContent() {
    return this.contents;
  }

  public int getLineNr() {
    return this.lineNr;
  }

  public Object getAttribute(String name) {
    return getAttribute(name, null);
  }

  public Object getAttribute(String name, Object defaultValue) {
    if (this.ignoreCase)
      name = name.toUpperCase();
    Object value = this.attributes.get(name);
    if (value == null)
      value = defaultValue;
    return value;
  }

  public Object getAttribute(String name, Hashtable valueSet, String defaultKey, boolean allowLiterals) {
    if (this.ignoreCase)
      name = name.toUpperCase();
    Object key = this.attributes.get(name);
    if (key == null)
      key = defaultKey;
    Object result = valueSet.get(key);
    if (result == null)
      if (allowLiterals) {
        result = key;
      } else {
        throw invalidValue(name, (String)key);
      }
    return result;
  }

  public String getStringAttribute(String name) {
    return getStringAttribute(name, null);
  }

  public Map getStringAttributes(String[] names) {
    Map attrNameValue = new HashMap();
    for (int i = 0; i < names.length; i++)
      attrNameValue.put(names[i], getStringAttribute(names[i]));
    return attrNameValue;
  }

  public String getStringAttribute(String name, String defaultValue) {
    return (String)getAttribute(name, defaultValue);
  }

  public String getStringAttribute(String name, Hashtable valueSet, String defaultKey, boolean allowLiterals) {
    return (String)getAttribute(name, valueSet, defaultKey, allowLiterals);
  }

  public int getIntAttribute(String name) {
    return getIntAttribute(name, 0);
  }

  public int getIntAttribute(String name, int defaultValue) {
    if (this.ignoreCase)
      name = name.toUpperCase();
    String value = (String)this.attributes.get(name);
    if (value == null)
      return defaultValue;
    try {
      return Integer.parseInt(value);
    } catch (NumberFormatException e) {
      throw invalidValue(name, value);
    }
  }

  public int getIntAttribute(String name, Hashtable valueSet, String defaultKey, boolean allowLiteralNumbers) {
    Integer result;
    if (this.ignoreCase)
      name = name.toUpperCase();
    Object key = this.attributes.get(name);
    if (key == null)
      key = defaultKey;
    try {
      result = (Integer)valueSet.get(key);
    } catch (ClassCastException e) {
      throw invalidValueSet(name);
    }
    if (result == null) {
      if (!allowLiteralNumbers)
        throw invalidValue(name, (String)key);
      try {
        result = Integer.valueOf((String)key);
      } catch (NumberFormatException e) {
        throw invalidValue(name, (String)key);
      }
    }
    return result.intValue();
  }

  public double getDoubleAttribute(String name) {
    return getDoubleAttribute(name, 0.0D);
  }

  public double getDoubleAttribute(String name, double defaultValue) {
    if (this.ignoreCase)
      name = name.toUpperCase();
    String value = (String)this.attributes.get(name);
    if (value == null)
      return defaultValue;
    try {
      return Double.valueOf(value).doubleValue();
    } catch (NumberFormatException e) {
      throw invalidValue(name, value);
    }
  }

  public double getDoubleAttribute(String name, Hashtable valueSet, String defaultKey, boolean allowLiteralNumbers) {
    Double result;
    if (this.ignoreCase)
      name = name.toUpperCase();
    Object key = this.attributes.get(name);
    if (key == null)
      key = defaultKey;
    try {
      result = (Double)valueSet.get(key);
    } catch (ClassCastException e) {
      throw invalidValueSet(name);
    }
    if (result == null) {
      if (!allowLiteralNumbers)
        throw invalidValue(name, (String)key);
      try {
        result = Double.valueOf((String)key);
      } catch (NumberFormatException e) {
        throw invalidValue(name, (String)key);
      }
    }
    return result.doubleValue();
  }

  public boolean getBooleanAttribute(String name, String trueValue, String falseValue, boolean defaultValue) {
    if (this.ignoreCase)
      name = name.toUpperCase();
    Object value = this.attributes.get(name);
    if (value == null)
      return defaultValue;
    if (value.equals(trueValue))
      return true;
    if (value.equals(falseValue))
      return false;
    throw invalidValue(name, (String)value);
  }

  public boolean getBooleanAttribute(String name, boolean defaultValue) {
    return getBooleanAttribute(name, "true", "false", defaultValue);
  }

  public int getIntProperty(String name, Hashtable valueSet, String defaultKey) {
    return getIntAttribute(name, valueSet, defaultKey, false);
  }

  public String getProperty(String name) {
    return getStringAttribute(name);
  }

  public String getProperty(String name, String defaultValue) {
    return getStringAttribute(name, defaultValue);
  }

  public int getProperty(String name, int defaultValue) {
    return getIntAttribute(name, defaultValue);
  }

  public double getProperty(String name, double defaultValue) {
    return getDoubleAttribute(name, defaultValue);
  }

  public boolean getProperty(String key, String trueValue, String falseValue, boolean defaultValue) {
    return getBooleanAttribute(key, trueValue, falseValue, defaultValue);
  }

  public Object getProperty(String name, Hashtable valueSet, String defaultKey) {
    return getAttribute(name, valueSet, defaultKey, false);
  }

  public String getStringProperty(String name, Hashtable valueSet, String defaultKey) {
    return getStringAttribute(name, valueSet, defaultKey, false);
  }

  public int getSpecialIntProperty(String name, Hashtable valueSet, String defaultKey) {
    return getIntAttribute(name, valueSet, defaultKey, true);
  }

  public double getSpecialDoubleProperty(String name, Hashtable valueSet, String defaultKey) {
    return getDoubleAttribute(name, valueSet, defaultKey, true);
  }

  public String getName() {
    return this.name;
  }

  public String getTagName() {
    return getName();
  }

  public void parseFromReader(Reader reader) throws IOException, XMLParseException {
    parseFromReader(reader, 1);
  }

  public void parseFromReader(Reader reader, int startingLineNr) throws IOException, XMLParseException {
    char ch;
    this.charReadTooMuch = Character.MIN_VALUE;
    this.reader = reader;
    this.parserLineNr = startingLineNr;
    while (true) {
      ch = scanWhitespace();
      if (ch != '<')
        throw expectedInput("<");
      ch = readChar();
      if (ch == '!' || ch == '?') {
        skipSpecialTag(0);
        continue;
      }
      break;
    }
    unreadChar(ch);
    scanElement(this);
  }

  public void parse(InputStream is, int startingLineNr) throws IOException, XMLParseException {
    BufferedReader dis;
    BufferedInputStream in = new BufferedInputStream(is);
    int maxHeader = 100;
    in.mark(maxHeader);
    StringBuffer fistLine = new StringBuffer();
    int c;
    while ((c = in.read()) != -1 && fistLine.length() < maxHeader) {
      fistLine.append((char)c);
      if (c == 62)
        break;
    }
    in.reset();
    String encoding = null;
    Pattern pattern = Pattern.compile("(encoding=\")([\\p{Alnum}-]+)\"");
    Matcher matcher = pattern.matcher(fistLine.toString());
    if (matcher.find())
      encoding = matcher.group(2);
    if (encoding == null) {
      dis = new BufferedReader(new InputStreamReader(in));
    } else {
      dis = new BufferedReader(new InputStreamReader(in, encoding));
    }
    try {
      parseFromReader(dis, 1);
    } finally {
      dis.close();
      in.close();
    }
  }

  public void parseString(String string) throws XMLParseException {
    try {
      parseFromReader(new StringReader(string), 1);
    } catch (IOException e) {}
  }

  public void parseString(String string, int offset) throws XMLParseException {
    parseString(string.substring(offset));
  }

  public void parseString(String string, int offset, int end) throws XMLParseException {
    parseString(string.substring(offset, end));
  }

  public void parseString(String string, int offset, int end, int startingLineNr) throws XMLParseException {
    string = string.substring(offset, end);
    try {
      parseFromReader(new StringReader(string), startingLineNr);
    } catch (IOException e) {}
  }

  public void parseCharArray(char[] input, int offset, int end) throws XMLParseException {
    parseCharArray(input, offset, end, 1);
  }

  public void parseCharArray(char[] input, int offset, int end, int startingLineNr) throws XMLParseException {
    try {
      Reader reader = new CharArrayReader(input, offset, end);
      parseFromReader(reader, startingLineNr);
    } catch (IOException e) {}
  }

  public void removeChild(XMLElement child) {
    this.children.removeElement(child);
  }

  public void removeChildren() {
    this.children.removeAllElements();
  }

  public void removeAttribute(String name) {
    if (this.ignoreCase)
      name = name.toUpperCase();
    this.attributes.remove(name);
  }

  public void removeProperty(String name) {
    removeAttribute(name);
  }

  public void removeChild(String name) {
    removeAttribute(name);
  }

  protected XMLElement createAnotherElement() {
    return new XMLElement(this.entities, this.ignoreWhitespace, false, this.ignoreCase);
  }

  public void setContent(String content) {
    this.contents = content;
  }

  public void setTagName(String name) {
    setName(name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    try {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      OutputStreamWriter writer = new OutputStreamWriter(out);
      write(writer);
      writer.flush();
      return new String(out.toByteArray());
    } catch (IOException e) {
      return super.toString();
    }
  }

  public void write(Writer writer) throws IOException {
    writeIdented(writer, 0);
  }

  private void writeTabs(Writer writer, int level) throws IOException {
    for (int i = 0; i < level; i++)
      writer.write(9);
  }

  private void writeIdented(Writer writer, int level) throws IOException {
    if (this.name == null) {
      writeEncoded(writer, this.contents);
      return;
    }
    boolean ident = true;
    writeTabs(writer, level);
    writer.write(60);
    writer.write(this.name);
    if (!this.attributes.isEmpty()) {
      Enumeration en = this.attributes.keys();
      while (en.hasMoreElements()) {
        writer.write(32);
        String key = en.nextElement();
        String value = (String)this.attributes.get(key);
        writer.write(key);
        writer.write(61);
        writer.write(34);
        writeEncoded(writer, value);
        writer.write(34);
      }
    }
    if (this.contents != null && this.contents.length() > 0) {
      writer.write(62);
      writeEncoded(writer, this.contents);
      writer.write(60);
      writer.write(47);
      writer.write(this.name);
      writer.write(62);
      writer.write(10);
    } else if (this.children.isEmpty()) {
      writer.write(47);
      writer.write(62);
      writer.write(10);
    } else {
      writer.write(62);
      writer.write(10);
      Enumeration en = enumerateChildren();
      while (en.hasMoreElements()) {
        XMLElement child = en.nextElement();
        child.writeIdented(writer, level + 1);
      }
      writeTabs(writer, level);
      writer.write(60);
      writer.write(47);
      writer.write(this.name);
      writer.write(62);
      writer.write(10);
    }
  }

  protected void writeEncoded(Writer writer, String str) throws IOException {
    for (int i = 0; i < str.length(); i++) {
      int unicode;
      char ch = str.charAt(i);
      switch (ch) {
        case '<':
          writer.write(38);
          writer.write(108);
          writer.write(116);
          writer.write(59);
          break;
        case '>':
          writer.write(38);
          writer.write(103);
          writer.write(116);
          writer.write(59);
          break;
        case '&':
          writer.write(38);
          writer.write(97);
          writer.write(109);
          writer.write(112);
          writer.write(59);
          break;
        case '"':
          writer.write(38);
          writer.write(113);
          writer.write(117);
          writer.write(111);
          writer.write(116);
          writer.write(59);
          break;
        case '\'':
          writer.write(38);
          writer.write(97);
          writer.write(112);
          writer.write(111);
          writer.write(115);
          writer.write(59);
          break;
        default:
          unicode = ch;
          if (unicode < 32 || unicode > 126) {
            writer.write(38);
            writer.write(35);
            writer.write(120);
            writer.write(Integer.toString(unicode, 16));
            writer.write(59);
            break;
          }
          writer.write(ch);
          break;
      }
    }
  }

  protected void scanIdentifier(StringBuffer result) throws IOException {
    while (true) {
      char ch = readChar();
      if ((ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z') && (ch < '0' || ch > '9') && ch != '_' && ch != '.' && ch != ':' && ch != '-' && ch <= '~') {
        unreadChar(ch);
        return;
      }
      result.append(ch);
    }
  }

  protected char scanWhitespace() throws IOException {
    char ch;
    while (true) {
      ch = readChar();
      switch (ch) {
        case '\t':
        case '\n':
        case '\r':
        case ' ':
          continue;
      }
      break;
    }
    return ch;
  }

  protected char scanWhitespace(StringBuffer result) throws IOException {
    char ch;
    while (true) {
      ch = readChar();
      switch (ch) {
        case '\t':
        case '\n':
        case ' ':
          result.append(ch);
          continue;
        case '\r':
          continue;
      }
      break;
    }
    return ch;
  }

  protected void scanString(StringBuffer string) throws IOException {
    char delimiter = readChar();
    if (delimiter != '\'' && delimiter != '"')
      throw expectedInput("' or \"");
    while (true) {
      char ch = readChar();
      if (ch == delimiter)
        return;
      if (ch == '&') {
        resolveEntity(string);
        continue;
      }
      string.append(ch);
    }
  }

  protected void scanPCData(StringBuffer data) throws IOException {
    while (true) {
      char ch = readChar();
      if (ch == '<') {
        ch = readChar();
        if (ch == '!') {
          checkCDATA(data);
          continue;
        }
        unreadChar(ch);
        return;
      }
      if (ch == '&') {
        resolveEntity(data);
        continue;
      }
      data.append(ch);
    }
  }

  protected boolean checkCDATA(StringBuffer buf) throws IOException {
    char ch = readChar();
    if (ch != '[') {
      unreadChar(ch);
      skipSpecialTag(0);
      return false;
    }
    if (!checkLiteral("CDATA[")) {
      skipSpecialTag(1);
      return false;
    }
    int delimiterCharsSkipped = 0;
    while (delimiterCharsSkipped < 3) {
      ch = readChar();
      switch (ch) {
        case ']':
          if (delimiterCharsSkipped < 2) {
            delimiterCharsSkipped++;
            continue;
          }
          buf.append(']');
          buf.append(']');
          delimiterCharsSkipped = 0;
          continue;
        case '>':
          if (delimiterCharsSkipped < 2) {
            for (int j = 0; j < delimiterCharsSkipped; j++)
              buf.append(']');
            delimiterCharsSkipped = 0;
            buf.append('>');
            continue;
          }
          delimiterCharsSkipped = 3;
          continue;
      }
      for (int i = 0; i < delimiterCharsSkipped; i++)
        buf.append(']');
      buf.append(ch);
      delimiterCharsSkipped = 0;
    }
    return true;
  }

  protected void skipComment() throws IOException {
    int dashesToRead = 2;
    while (dashesToRead > 0) {
      char ch = readChar();
      if (ch == '-') {
        dashesToRead--;
        continue;
      }
      dashesToRead = 2;
    }
    if (readChar() != '>')
      throw expectedInput(">");
  }

  protected void skipSpecialTag(int bracketLevel) throws IOException {
    int tagLevel = 1;
    char stringDelimiter = Character.MIN_VALUE;
    if (bracketLevel == 0) {
      char ch = readChar();
      if (ch == '[') {
        bracketLevel++;
      } else if (ch == '-') {
        ch = readChar();
        if (ch == '[') {
          bracketLevel++;
        } else if (ch == ']') {
          bracketLevel--;
        } else if (ch == '-') {
          skipComment();
          return;
        }
      }
    }
    while (tagLevel > 0) {
      char ch = readChar();
      if (stringDelimiter == '\000') {
        if (ch == '"' || ch == '\'') {
          stringDelimiter = ch;
        } else if (bracketLevel <= 0) {
          if (ch == '<') {
            tagLevel++;
          } else if (ch == '>') {
            tagLevel--;
          }
        }
        if (ch == '[') {
          bracketLevel++;
          continue;
        }
        if (ch == ']')
          bracketLevel--;
        continue;
      }
      if (ch == stringDelimiter)
        stringDelimiter = Character.MIN_VALUE;
    }
  }

  protected boolean checkLiteral(String literal) throws IOException {
    int length = literal.length();
    for (int i = 0; i < length; i++) {
      if (readChar() != literal.charAt(i))
        return false;
    }
    return true;
  }

  protected char readChar() throws IOException {
    if (this.charReadTooMuch != '\000') {
      char ch = this.charReadTooMuch;
      this.charReadTooMuch = Character.MIN_VALUE;
      return ch;
    }
    int i = this.reader.read();
    if (i < 0)
      throw unexpectedEndOfData();
    if (i == 10) {
      this.parserLineNr++;
      return '\n';
    }
    return (char)i;
  }

  protected void scanElement(XMLElement elt) throws IOException {
    StringBuffer buf = new StringBuffer();
    scanIdentifier(buf);
    String name = buf.toString();
    elt.setName(name);
    char ch = scanWhitespace();
    while (ch != '>' && ch != '/') {
      buf.setLength(0);
      unreadChar(ch);
      scanIdentifier(buf);
      String key = buf.toString();
      ch = scanWhitespace();
      if (ch != '=')
        throw expectedInput("=");
      unreadChar(scanWhitespace());
      buf.setLength(0);
      scanString(buf);
      elt.setAttribute(key, buf);
      ch = scanWhitespace();
    }
    if (ch == '/') {
      ch = readChar();
      if (ch != '>')
        throw expectedInput(">");
      return;
    }
    buf.setLength(0);
    ch = scanWhitespace(buf);
    if (ch != '<') {
      unreadChar(ch);
      scanPCData(buf);
    } else {
      while (true) {
        ch = readChar();
        if (ch == '!') {
          if (checkCDATA(buf)) {
            scanPCData(buf);
            break;
          }
          ch = scanWhitespace(buf);
          if (ch != '<') {
            unreadChar(ch);
            scanPCData(buf);
            break;
          }
          continue;
        }
        buf.setLength(0);
        break;
      }
    }
    if (buf.length() == 0) {
      while (ch != '/') {
        if (ch == '!') {
          ch = readChar();
          if (ch != '-')
            throw expectedInput("Comment or Element");
          ch = readChar();
          if (ch != '-')
            throw expectedInput("Comment or Element");
          skipComment();
        } else {
          unreadChar(ch);
          XMLElement child = createAnotherElement();
          scanElement(child);
          elt.addChild(child);
        }
        ch = scanWhitespace();
        if (ch != '<')
          throw expectedInput("<");
        ch = readChar();
      }
      unreadChar(ch);
    } else if (this.ignoreWhitespace) {
      elt.setContent(buf.toString().trim());
    } else {
      elt.setContent(buf.toString());
    }
    ch = readChar();
    if (ch != '/')
      throw expectedInput("/");
    unreadChar(scanWhitespace());
    if (!checkLiteral(name))
      throw expectedInput(name);
    if (scanWhitespace() != '>')
      throw expectedInput(">");
  }

  protected void resolveEntity(StringBuffer buf) throws IOException {
    char ch = Character.MIN_VALUE;
    StringBuffer keyBuf = new StringBuffer();
    while (true) {
      ch = readChar();
      if (ch == ';')
        break;
      keyBuf.append(ch);
    }
    String key = keyBuf.toString();
    if (key.charAt(0) == '#') {
      try {
        if (key.charAt(1) == 'x') {
          ch = (char)Integer.parseInt(key.substring(2), 16);
        } else {
          ch = (char)Integer.parseInt(key.substring(1), 10);
        }
      } catch (NumberFormatException e) {
        throw unknownEntity(key);
      }
      buf.append(ch);
    } else {
      char[] value = (char[])this.entities.get(key);
      if (value == null)
        throw unknownEntity(key);
      buf.append(value);
    }
  }

  protected void unreadChar(char ch) {
    this.charReadTooMuch = ch;
  }

  protected XMLParseException invalidValueSet(String name) {
    String msg = "Invalid value set (entity name = \"" + name + "\")";
    return new XMLParseException(getName(), this.parserLineNr, msg);
  }

  protected XMLParseException invalidValue(String name, String value) {
    String msg = "Attribute \"" + name + "\" does not contain a valid " + "value (\"" + value + "\")";
    return new XMLParseException(getName(), this.parserLineNr, msg);
  }

  protected XMLParseException unexpectedEndOfData() {
    String msg = "Unexpected end of data reached";
    return new XMLParseException(getName(), this.parserLineNr, msg);
  }

  protected XMLParseException syntaxError(String context) {
    String msg = "Syntax error while parsing " + context;
    return new XMLParseException(getName(), this.parserLineNr, msg);
  }

  protected XMLParseException expectedInput(String charSet) {
    String msg = "Expected: " + charSet;
    return new XMLParseException(getName(), this.parserLineNr, msg);
  }

  protected XMLParseException unknownEntity(String name) {
    String msg = "Unknown or invalid entity: &" + name + ";";
    return new XMLParseException(getName(), this.parserLineNr, msg);
  }
}
