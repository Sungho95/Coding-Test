import sys
a, b, c = map(int, sys.stdin.readline().split())

if b >= c:
    print('-1')
else:
    break_even_point = (a // (c - b)) + 1
    print(break_even_point)