# -*- coding: utf-8 -*-

import sys
t = int(sys.stdin.readline())

for i in range(t):
    floor = int(sys.stdin.readline())
    room_num = int(sys.stdin.readline())
    result = [a for a in range(1, room_num+1)]

    for j in range(floor):
        for k in range(1, room_num):
            result[k] += result[k-1]
    print(result[-1])
