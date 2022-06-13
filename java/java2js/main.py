#  -*- coding: utf-8 -*-
__author__ = "kubik.augustyn@post.cz"


def filterNonBlankStrings(x):
    return len(x) == 0


isCommented = False


def parseLineComments(line=""):
    global isCommented
    code = ""
    comment = ""
    isCodeFirst = True
    oneLineComment = line.find("//")
    moreLinesCommentBegin = line.find("/*")
    moreLinesCommentEnd = line.find("*/")
    if not isCommented:
        if moreLinesCommentBegin > -1 and oneLineComment > -1:
            if moreLinesCommentBegin > oneLineComment:
                code = line[:oneLineComment]
                comment = line[oneLineComment:]
            else:
                isCommented = True
                code = line[:moreLinesCommentBegin]
                comment = line[moreLinesCommentBegin:]
        elif oneLineComment > -1 and moreLinesCommentBegin < 0:
            isCodeFirst = oneLineComment > 0
            code = line[:oneLineComment]
            comment = line[oneLineComment:]
        elif oneLineComment < 0 and moreLinesCommentBegin > -1:
            isCodeFirst = moreLinesCommentBegin > 0
            isCommented = True
            code = line[:moreLinesCommentBegin]
            comment = line[moreLinesCommentBegin:]
        else:
            code = line
    if isCommented:
        isCodeFirst = False
        comment = line[:moreLinesCommentEnd + 2]
        code = line[moreLinesCommentEnd + 2:]
        if moreLinesCommentEnd > -1:
            isCommented = False
    return (code, comment, isCodeFirst)


def parseClassBeginning(classBegining=""):
    name = ""
    extendsName = ""
    implementsName = ""
    parts = classBegining.split(" ")
    extends = False
    implements = False
    for part in parts:
        if ["public", "final", "class"].__contains__(part):
            pass
        elif part == "extends":
            extends = True
            implements = False
        elif part == "implements":
            implements = True
            extends = False
        elif extends:
            extendsName += part
            if part[:-1] != ",":
                extends = False
        elif implements:
            implementsName += part
            if part[:-1] != ",":
                implements = False
        else:
            name += part
            implements = False
            extends = False
    return (name, extendsName, implementsName)

def processComment(comment, resultLines):
    if len(comment) > 0:
        resultLines.append(comment)

def processCode(code, resultLines):
    if len(code) > 0:
        if code[-1:] == ";":
            code = code[:-1]
        if code.startswith("import "):
            # import ??????
            toImport = code[7:]
            print(isCommented)
            resultLines.append(f"/*Import: {toImport}*/")
        elif code.__contains__("class"):
            # class ???????
            name, extendsName, implementsName = parseClassBeginning(code)
            resultLines.append(f"class {name} {{//{code}")
            # print(", ".join([name, extendsName, implementsName]))
            pass
        else:
            resultLines.append("")

def java2js(sourcePath, resultPath, tabSize="    "):
    source = open(sourcePath, "r")
    sourceLines = source.readlines()
    result = open(resultPath, "w+")
    resultLines = [
        '/**************************/',
        '/*  Converted by Java2JS  */',
        '/*        Author:         */',
        '/* kubik.augustyn@post.cz */',
        '/**************************/',
        '',
    ]
    # begin
    for sourceLine in sourceLines:
        sourceLine = sourceLine[:-1]
        tabsNum = len(list(filter(filterNonBlankStrings, sourceLine.split(tabSize))))
        tabsString = tabSize * tabsNum
        line = sourceLine[len(tabsString):]
        code, comment, isCodeFirst = parseLineComments(line)

        if isCodeFirst:
            processCode(code, resultLines)
            processComment(comment, resultLines)
        else:
            processComment(comment, resultLines)
            processCode(code, resultLines)
        print(tabsNum, f"'{tabsString}'", f"'{code}'", f"'{comment}'")
    # end
    result.write("\n".join(resultLines))


if __name__ == '__main__':
    java2js("C:\\Users\\Radek Augustyn\\Downloads\\diamondRush\\java\\GloftDIRU.java",
            "C:\\Users\\Radek Augustyn\\Downloads\\diamondRush\\java\\GloftDIRU.js")
