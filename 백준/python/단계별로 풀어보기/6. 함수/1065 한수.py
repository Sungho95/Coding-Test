# -*- coding: utf-8 -*-

# 1
# n = int(input())
# hansu = 0
# 
# for i in range(1, n+1):
#     if i < 100:
#         hansu += 1
#     if i >= 100:
#         temp1 = int(str(i)[0]) - int(str(i)[1])
#         temp2 = int(str(i)[1]) - int(str(i)[2])
#         if  temp1 == temp2:
#             hansu+=1
# print(hansu)

# 2
n = int(input())

def hansu(n):
    hansu_cnt = 0
    for i in range(1, n+1):
        if i < 100:
            hansu_cnt += 1
        elif (int(str(i)[0])-int(str(i)[1])) == (int(str(i)[1])-int(str(i)[2])):
            hansu_cnt +=1
    return hansu_cnt
print(hansu(n))