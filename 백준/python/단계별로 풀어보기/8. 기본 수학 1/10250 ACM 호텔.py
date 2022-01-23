# -*- coding: utf-8 -*-

import sys
t = int(sys.stdin.readline())

for i in range(t):
    h, w, n = map(int, sys.stdin.readline().split())
    floor = n % h
    room_num = (n // h) + 1
    if n % h == 0:
        floor = h
        room_num -= 1
    print(floor*100+room_num)