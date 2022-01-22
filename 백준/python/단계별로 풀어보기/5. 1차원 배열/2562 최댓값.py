# -*- coding: utf-8 -*-

# 1
# a = []
# for i in range(9):
#     n = int(input())
#     a.append(n)
# print(max(a))
# print(a.index(max(a))+1)

# 2
max_n = 0
idx = 0
for i in range(1, 10):
    n = int(input())
    if n > max_n:
        max_n = n
        idx = i

print(max_n)
print(idx)