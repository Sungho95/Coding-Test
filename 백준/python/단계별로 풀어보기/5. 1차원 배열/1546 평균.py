# -*- coding: utf-8 -*-

# 1
n = int(input())
score = list(map(int, input().split()))
fake_score = []

for i in range(n):
    fake_score.append((score[i] / max(score)) * 100)

print(sum(fake_score) / n)

# 2
# 1n = int(input())
# score = list(map(int, input().split()))
# fake_score = [0] * n
# 
# for i in range(n):
#     fake_score[i] = (score[i] / max(score)) * 100
# 
# print(sum(fake_score) / n)