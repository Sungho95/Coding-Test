# -*- coding: utf-8 -*-

# 1
# s = input()
# croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
# result = 0
# 
# for i in s:
#     result += 1
# 
# for j in croatia:
#     if j in s:
#         result -= s.count(j)
# 
# print(result)

# 2
s = input()
croatia = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in croatia:
    s = s.replace(i, '.')

print(len(s))