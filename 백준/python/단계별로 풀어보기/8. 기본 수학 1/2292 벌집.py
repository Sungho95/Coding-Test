# -*- coding: utf-8 -*-

n = int(input())
room = 1
result = 1

while n > room:
    room += 6 * result
    result += 1

print(result)