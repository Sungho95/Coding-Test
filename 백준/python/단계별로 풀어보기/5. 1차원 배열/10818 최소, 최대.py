# -*- coding: utf-8 -*-

# 1
n = int(input())
a = list(map(int, input().split()))

print(min(a), max(a))


# 2
# n = int(input())
# a = list(map(int, input().split()))
# 
# max_num = a[0]
# min_num = a[0]
# for i in range(n):
#     if max_num < a[i]:
#         max_num = a[i]
#     if min_num > a[i]:
#         min_num = a[i]
# print(min_num, max_num)