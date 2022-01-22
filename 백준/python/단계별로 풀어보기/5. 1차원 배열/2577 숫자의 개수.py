# -*- coding: utf-8 -*-

# 1
# a = int(input())
# b = int(input())
# c = int(input())
# 
# abc = a * b * c
# result = [0] * 10
# 
# for i in str(abc):
#     result[int(i)] += 1
# 
# for i in result:
#     print(i)
    
# 2
result = 1
for i in range(3):
    result *= int(input())

result = list(str(result))

for j in range(10):
    print(result.count(str(j)))