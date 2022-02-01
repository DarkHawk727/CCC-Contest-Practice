import sys

input = sys.stdin.readline

M = int(input())
N = int(input())
K = int(input())

rows, cols = [0] * (M + 1), [0] * (N + 1)

for _ in range(K):
    raw_input = input().strip().split(" ")
    if raw_input[0] == "R":
        rows[int(raw_input[1])] += 1
    else:
        cols[int(raw_input[1])] += 1

count = 0
for i in range(1, M + 1):
    for j in range(1, N + 1):
        if (rows[i] + cols[j]) % 2 != 0:
            count += 1

print(count)
