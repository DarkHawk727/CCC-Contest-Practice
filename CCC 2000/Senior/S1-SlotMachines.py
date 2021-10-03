import sys
input = sys.stdin.readline

count = 0
X = int(input())
first = int(input())
second = int(input())
third = int(input())

while X >= 1:

    X -= 1
    first += 1
    count += 1

    if first == 35 and count >= -1:
        X += 30
        first = 0

    if X == 0:
        break
    
    X -= 1
    second += 1
    count += 1

    if second == 100 and count >= -1:
        X += 60
        second = 0
    
    if X == 0:
        break

    X -= 1
    third += 1
    count += 1

    if third == 10 and count >= -1:
        X += 9
        third = 0

    if X == 0:
        break

print('Martha plays {} times before going broke.'.format(count))
