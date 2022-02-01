import sys

input = sys.stdin.readline

N = int(input())


def func(string1, string2):
    len1, len2 = len(string1), len(string2)
    if len2 > len1:
        string1, string2 = string2, string1
        len1, len2 = len2, len1
    if string1[:len2] != string2 and string1[-len2:] != string2:
        # print(string1[:len2], string2, string1[-len2:])
        return True
    else:
        return False


for _ in range(N):
    string1 = input().strip()
    string2 = input().strip()
    string3 = input().strip()
    if func(string1, string2) and func(string2, string3) and func(string1, string3):
        print("Yes")
    else:
        print("No")
