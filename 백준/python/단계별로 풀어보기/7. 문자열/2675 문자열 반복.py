# -*- coding: utf-8 -*-

n = int(input())
for i in range(n):
    r, s = map(str, input().split())
    r = int(r)
    result = ''
    for j in s:
        result += j*r
    print(result)