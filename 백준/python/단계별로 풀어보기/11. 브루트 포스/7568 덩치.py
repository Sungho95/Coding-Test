n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
result = []

for i in range(n):
    rank = 1
    for j in range(n):
        if arr[i][0] < arr[j][0] and arr[i][1] < arr[j][1]:
            rank += 1
    result.append(rank)

for k in range(n):
    print(result[k], end=' ')