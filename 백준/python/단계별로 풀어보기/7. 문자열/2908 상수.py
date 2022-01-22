# -*- coding: utf-8 -*-

# 1
# a, b = input().split()
# a = int(a[::-1])
# b = int(b[::-1])
# 
# if a > b:
#     print(a)
# else:
#     print(b)
    
# 2
a, b = input().split()

reverse_a = ''
reverse_b = ''

for i in range(3):
    reverse_a = a[i] + reverse_a
    reverse_b = b[i] + reverse_b

if int(reverse_a) > int(reverse_b):
    print(reverse_a)
else:
    print(reverse_b)