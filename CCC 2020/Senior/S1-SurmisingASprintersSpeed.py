pairs = []
speeds = []

N = int(input())

for i in range(N):
    raw_input = input().split()
    time = int(raw_input[0])
    distance = int(raw_input[1])
    pairs.append(tuple((time, distance)))

pairs = sorted(pairs, key=lambda x: x[0])

for i in range(len(pairs)-1):
    speed = abs((pairs[i][1] - pairs[i+1][1]) / (pairs[i][0] - pairs[i+1][0]))
    speeds.append(speed)

print(max(speeds))
