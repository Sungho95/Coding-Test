# -*- coding: utf-8 -*-

import sys
x = int(sys.stdin.readline())
line = 1

while x > line:
    x -= line
    line += 1
    
if (line % 2) == 0:
    a = x
    b = line - x + 1
else:
    a = line - x + 1
    b = x

print('%d/%d' % (a, b))