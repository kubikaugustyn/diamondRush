#  -*- coding: utf-8 -*-
__author__ = "kubik.augustyn@post.cz"

FILE = r"C:\Users\Radek Augustyn\Desktop\Kubik\diamondRush\browser\diamond_EUD.jar\0.f"
OUTPUT = r"C:\Users\Radek Augustyn\Desktop\Kubik\diamondRush\browser\diamond_EUD.jar\0.f.csv"
SEP = ","
NL = "\r\n"


def hexString(number):
    hex_str = hex(number)[2:]
    if len(hex_str) == 1:
        hex_str = "0" + hex_str
    return hex_str


def toCsv(file_in_name, file_out_name):
    file_in = open(file_in_name, "rb+")
    data = file_in.read()
    file_in.close()
    print(data)
    text_out = f"Index,Byte,Meaning{NL}"
    for i, byte in enumerate(data):
        text_out += f'{i}{SEP}{hexString(byte)}{SEP}{NL}'
    print(text_out)
    with open(file_out_name, "wb+") as file_out:
        file_out.write(bytes(text_out, 'utf-8'))


if __name__ == '__main__':
    toCsv(FILE, OUTPUT)
