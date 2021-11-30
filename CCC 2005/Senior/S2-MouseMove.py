import sys

input = sys.stdin.readline
x_coords, y_coords = [], []
c, r = map(int, input().split())
x, y = 999, 999

while not (x == 0 and y == 0):
    raw_input = input()
    x, y = map(int, raw_input.split())
    x_coords.append(x)
    y_coords.append(y)
x_coords = x_coords[:-1]
y_coords = y_coords[:-1]

x, y = 0, 0
for coord in zip(x_coords, y_coords):
    x += coord[0]
    y += coord[1]
    if x < 0:
        x = 0
    if y < 0:
        y = 0  
    if x > c:
        x = c
    if y > r:
        y = r

    print(x, y)
