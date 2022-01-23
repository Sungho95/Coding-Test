# -*- coding: utf-8 -*-
import sys
n = int(sys.stdin.readline())
decimal = list(map(int, sys.stdin.readline().split()))
count = 0

for i in range(n):
    temp = 0
    if decimal[i] == 1:
        continue
    else:
        for j in range(2, decimal[i]):
            if decimal[i] % j == 0:
                temp = -1
        if temp == 0:
            count += 1

print(count)
