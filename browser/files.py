#  -*- coding: utf-8 -*-
__author__ = "kubik.augustyn@post.cz"

from os import walk

filenames = next(walk("diamond_EUD.jar"), (None, None, []))[2]
print('", "'.join(filenames))
