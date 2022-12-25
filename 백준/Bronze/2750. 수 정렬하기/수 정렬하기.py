n = int(input())
arr = [int(input()) for _ in range(n)]

# 선택 정렬
for i in range(len(arr) - 1):
    min_idx = i
    for j in range(i + 1, len(arr)):
        if arr[j] < arr[min_idx]:
            min_idx = j
    arr[i], arr[min_idx] = arr[min_idx], arr[i]

for i in range(n):
    print(arr[i])