a, b = map(int, input().split())
c = int(input())

if b + c >= 60:
    a += (b + c) // 60
    result = (b + c) % 60
else:
    result = b + c

if a >= 24:
    a -= 24