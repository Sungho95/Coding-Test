# -*- coding: utf-8 -*-

# 1
c = int(input())

for i in range(c):
    std_score = list(map(int, input().split()))
    std = std_score[0]
    std_avg = sum(std_score[1:len(std_score)]) / std
    count = 0
    for j in range(1, len(std_score)):
        if std_score[j] > std_avg:
            count += 1
    print('%.3f%%' % ((count/std)*100))
    
# 2
# 1c = int(input())
# std_score = []
# for i in range(c):
#     std_score.append(list(map(int, input().split())))
# 
# for j in range(c):
#     std = std_score[j][0]
#     std_avg = sum(std_score[j][1:]) / std
#     count = 0
#     for k in range(1, len(std_score[j])):
#         if std_score[j][k] > std_avg:
#             count += 1
#     print('{0:.3f}%'.format((count/std) * 100))