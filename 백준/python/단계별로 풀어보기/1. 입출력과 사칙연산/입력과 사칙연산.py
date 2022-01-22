# -*- coding: utf-8 -*-

# 2557 Hello World
print("Hello World!")

# 10718 We love kriii
print("강한친구 대한육군");
print("강한친구 대한육군");

# 10171 고양이
print("\\    /\\")
print(" )  ( ')")
print("(  /  )")
print(" \\(__)|")

# 10172 개
print("|\\_/|");
print("|q p|   /}");
print("( 0 )\"\"\"\\");
print("|\"^\"`    |");
print("||_/=\\\\__|");

# 1000 A+B
a, b = map(int, input().split())
print(a+b)

# 1001 A-B
a, b = map(int, input().split())
print(a-b)

# 10998 AxB
a, b = map(int, input().split())
print(a*b)

# 1008 A/B
a, b = map(int, input().split())
print(a/b)

# 10869 사칙연산
a, b = map(int, input().split())
print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a%b)

# 10430 나머지
a, b, c = map(int, input().split())
print((a+b)%c)
print(((a%c)+(b%c))%c)
print((a*b)%c)
print(((a%c)*(b%c))%c)

# 2588 곱셈
a = input()
b = input()

j = list(map(int, b))
a = int(a)
b = int(b)

for i in reversed(j):
    print(a*i)
print(a*b)
