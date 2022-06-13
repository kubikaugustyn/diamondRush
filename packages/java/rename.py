#  -*- coding: utf-8 -*-
__author__ = "kubik.augustyn@post.cz"

import os


def rename_dir(path, fromExt=".class", toExt=".java"):
    for _, dirs, files in os.walk(path):
        for dir in dirs:
            rename_dir(path + os.sep + dir, fromExt, toExt)
        for file in files:
            name, ext = os.path.splitext(file)
            if ext == fromExt:
                os.rename(path + os.sep + name + fromExt, path + os.sep + name + toExt)


if __name__ == '__main__':
    rename_dir(r"C:\Users\Radek Augustyn\Downloads\diamondRush\packages\java")
