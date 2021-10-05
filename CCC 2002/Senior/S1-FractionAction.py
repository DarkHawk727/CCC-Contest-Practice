import math
import sys

input = sys.stdin.readline

count = 0

X = int(input())
Y = int(input())

gcd = math.gcd(X, Y)

finalnum = X / gcd
finalden = Y / gcd

if (Y/gcd == 1):
    print(int(X/gcd))
elif (finalnum > finalden):
    while finalnum > finalden:
        finalnum -= finalden
        count += 1
    print('{} {}/{}'.format(count, int(finalnum), int(finalden)))
else:
    print('{}/{}'.format(int(finalnum), int(finalden)))
