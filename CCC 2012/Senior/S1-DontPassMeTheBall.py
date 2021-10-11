import sys
input = sys.stdin.readline

J = int(input())
ans = int(((J-1)*(J-2)*(J-3))/6)
print(ans)
