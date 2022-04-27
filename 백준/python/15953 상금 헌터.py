# -*- coding: utf-8 -*-

t = int(input())

for i in range(t):
    a, b = map(int, input().split())
    money = 0
    if a == 1:
        money += 500
    elif a == 2 or a == 3:
        money += 300
    elif 4 <= a <= 6:
        money += 200
    elif 7 <= a <= 10:
        money += 50
    elif 11 <= a <= 15:
        money += 30
    elif 16 <= a <= 21:
        money += 10
    else:
        money += 0

    if b == 1:
        money += 512
    elif b == 2 or b == 3:
        money += 256
    elif 4 <= b <= 7:
        money += 128
    elif 8 <= b <= 15:
        money += 64
    elif 16 <= b <= 31:
        money += 32
    else:
        money += 0

    print(money * 10000)