# -*- coding: utf-8 -*-

import sys

n = int(sys.stdin.readline())
group_cnt = 0

for i in range(n):
    s = sys.stdin.readline()
    checker = ''
    for j in range(len(s)-1):
        if s[j] != s[j+1]:
            checker += s[j]
    if len(checker) == len(set(checker)):
        group_cnt += 1

print(group_cnt)