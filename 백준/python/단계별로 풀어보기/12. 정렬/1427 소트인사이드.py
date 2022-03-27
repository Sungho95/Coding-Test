n = int(input())
arr = []
for i in str(n):
    arr.append(int(i))

n = sorted(arr, reverse=True)

for i in n:
    print(i, end='')