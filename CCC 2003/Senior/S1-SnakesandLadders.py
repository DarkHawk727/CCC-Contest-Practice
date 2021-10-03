import sys
input = sys.stdin.readline

win = False
messages = []
choice = 0
var = 1

while not win:
    choice = int(input())
    if choice == 0:
        break
    var += choice
    if var == 9:
        var = 34
    elif var == 40:
        var = 64
    elif var == 54:
        var = 19
    elif var == 67:
        var = 86
    elif var == 90:
        var = 48
    elif var == 99:
        var = 77
    elif var == 100:
        win = True
    elif var > 100:
        var -= choice

    messages.append('Your are now on square {}'.format(var))

for line in messages:
    print(line)

if choice == 0:
    print('You Quit!')
else:
    print('You Win!')
        
