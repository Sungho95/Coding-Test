# -*- coding: utf-8 -*-

import sys
m = int(sys.stdin.readline())
n = int(sys.stdin.readline())
decimal = []

for i in range(m, n+1):
    temp = 0
    if i == 1:
        continue
    else:
        for j in range(2, i):
            if i % j == 0:
                temp = -1
                break
        if temp == 0:
            decimal.append(i)
if len(decimal) == 0:
    print(-1)
else:
    print(sum(decimal))
    print(decimal[0])