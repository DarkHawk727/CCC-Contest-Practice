import sys
import math
input = sys.stdin.readline

n = 1
areas = []
while n != 0:
    n = int(input())
    areas.append(n)

for area in areas[:-1]:
    dividents = []
    for i in range(1, int(math.sqrt(area)+1)):
        if area % i == 0:
            dividents.append(i)
            dividents.append(area/i)
    dividents.sort()

    length = int(dividents[int(len(dividents)/2)])
    width = int(area // length)
    perimeter = 2*length + 2*width
    
    print('Minimum perimeter is {} with dimensions {} x {}'.format(perimeter, length, width))
