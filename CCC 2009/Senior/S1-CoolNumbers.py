import sys
input = sys.stdin.readline

count = 0
a = int(input())
b = int(input())

for i in range(1, 23):
    temp = i ** 6
    if temp >= a and temp <= b:
        count += 1
    
print(count)
