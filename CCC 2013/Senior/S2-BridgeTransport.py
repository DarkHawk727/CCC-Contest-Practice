import sys

input = sys.stdin.readline

W = int(input())
N = int(input())

bridge = []
weight, count = 0, 0

for _ in range(N):
    car = int(input())
    weight += car
    bridge.append(car)

    if len(bridge) > 4:
        weight -= bridge.pop(0)

    if weight > W:
        break
    else:
        count += 1

print(count)
