import sys

input = sys.stdin.readline

area = 0.0
N = int(input())
heights = list(map(int, input().split()))
bases = list(map(int, input().split()))

for i in range(len(bases)):
    area += (heights[i] + heights[i+1]) * bases[i] / 2

print(area)
