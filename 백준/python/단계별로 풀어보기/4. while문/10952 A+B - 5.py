# -*- coding: utf-8 -*-

# 1
# flag = True
# while flag:
#     a, b = map(int, input().split())
#     if a == 0 & b == 0:
#         flag = False
#     else:
#         print(a+b)

# 2
while True:
    a, b = map(int, input().split())
    if a == 0 & b == 0:
        break
    else:
        print(a+b)