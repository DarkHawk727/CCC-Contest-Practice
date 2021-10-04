import sys
input = sys.stdin.readline

swift_sum = 0
semaphore_sum = 0 
ans = 0

N = int(input())

swift_scores = list(map(int, input().split()))
semaphore_scores = list(map(int, input().split()))


for index in range(N):
    swift_sum += swift_scores[index]
    semaphore_sum += semaphore_scores[index]
    if swift_sum == semaphore_sum:
        ans = index + 1

print(ans)
