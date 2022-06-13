package nanoxml;

public class XMLParseException extends RuntimeException {
  public static final int NO_LINE = -1;

  private int lineNr;

  public XMLParseException(String name, String message) {
    super("XML Parse Exception during parsing of " + ((name == null) ? "the XML definition" : ("a " + name + " element")) + ": " + message);
    this.lineNr = -1;
  }

  public XMLParseException(String name, int lineNr, String message) {
    super("XML Parse Exception during parsing of " + ((name == null) ? "the XML definition" : ("a " + name + " element")) + " at line " + lineNr + ": " + message);
    this.lineNr = lineNr;
  }

  public int getLineNr() {
    return this.lineNr;
  }
}
