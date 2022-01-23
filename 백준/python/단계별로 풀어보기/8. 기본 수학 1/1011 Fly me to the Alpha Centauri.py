# -*- coding: utf-8 -*-
import sys

t = int(sys.stdin.readline())

for i in range(t):
    x, y = map(int, sys.stdin.readline().split())
    distance = y-x
    count = 0
    while True:
        if distance <= count * (count + 1):
            break
        count += 1

    if distance > count ** 2:
        print(count * 2)
    else:
        print(count * 2 - 1)