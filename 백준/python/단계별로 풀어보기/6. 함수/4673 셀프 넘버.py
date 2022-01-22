# -*- coding: utf-8 -*-

# 1
# self_num = set(range(1, 10001))
# non_self_num = set()
# 
# for i in range(1, 10001):
#     for j in str(i):
#         i += int(j)
#     non_self_num.add(i)
# 
# self_num = sorted(self_num - non_self_num)
# for k in self_num:
#     print(k)
    
# 2
def non_self_num_makers(n):
    n = n + sum(map(int, str(n)))
    return n

self_num = set(range(1, 10001))
non_self_num = set()

for i in range(1, 10001):
    non_self_num.add(non_self_num_makers(i))

self_num = sorted(self_num - non_self_num)

for j in self_num:
    print(j)