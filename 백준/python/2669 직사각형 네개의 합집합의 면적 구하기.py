arr = [[0] * 100 for _ in range(100)]

for _ in range(4):
    ax, ay, bx, by = map(int, input().split())

    for i in range(ax, bx):
        for j in range(ay, by):
            arr[i][j] = 1

result = 0
for k in arr:
    result += sum(k)

print(result)