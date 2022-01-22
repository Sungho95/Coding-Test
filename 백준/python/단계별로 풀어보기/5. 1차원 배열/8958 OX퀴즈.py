# -*- coding: utf-8 -*-

# 1
# n = int(input())
# 
# for i in range(n):
#     ox_list = list(input())
#     score = 0
#     sum_score = 0
#     for j in ox_list:
#         if j == 'O':
#             score += 1
#             sum_score += score
#         else:
#             score = 0
#     print(sum_score)
    
# 2
n = int(input())
ox_list = []

for i in range(n):
    ox_list.append(input())

for j in range(n):
    score = 0
    sum_score = 0
    for k in range(len(ox_list[j])):
        if ox_list[j][k] == 'O':
            score += 1
            sum_score += score
        else:
            score = 0
    print(sum_score)