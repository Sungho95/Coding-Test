import sys

n = int(sys.stdin.readline())
input_num = [0] * 10001

for i in range(n):
    input_num[int(sys.stdin.readline())] += 1

for i in range(len(input_num)):
    if input_num[i] != 0:
        for j in range(input_num[i]):
            print(i)