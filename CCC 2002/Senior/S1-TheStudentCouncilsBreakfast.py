import sys
input = sys.stdin.readline

combos = 0
smallest = 99999999

pink = int(input())
green = int(input())
red = int(input())
orange = int(input())
amount = int(input())

for p in range(amount//pink + 1):
    for g in range(amount//green + 1):
        for r in range(amount//red + 1):
            for o in range(amount//orange + 1):
                if p*pink + g*green + r*red + o*orange == amount:
                    print('# of PINK is {} # of GREEN is {} # of RED is {} # of ORANGE is {}'.format(p, g, r, o))
                    combos  += 1
                    smallest = min(smallest, p + g + r + o)

print('Total combinations is {}.'.format(combos))
print('Minimum number of tickets to print is {}.'.format(smallest))
