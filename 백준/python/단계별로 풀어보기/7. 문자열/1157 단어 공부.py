# -*- coding: utf-8 -*-

s = input().upper()
result = list(set(s))
count_list = []

for i in result:
    count_list.append(s.count(i))

if count_list.count(max(count_list)) >= 2:
    print('?')
else:
    print(result[count_list.index(max(count_list))])