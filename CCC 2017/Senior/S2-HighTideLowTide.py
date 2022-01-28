import sys

input = sys.stdin.readline

N = int(input())
tides = sorted(list(map(int, input().split())))

if len(tides) % 2 == 1:
    middle = len(tides) // 2 + 1
else:
    middle = len(tides) // 2

high_tides = sorted(tides[:middle], reverse=True)
low_tides = tides[middle:]

try:
    for i in range(len(high_tides)):
        print(high_tides[i], end=" ")
        print(low_tides[i], end=" ")
except IndexError:
    pass
