import sys
input = sys.stdin.readline

n = int(input())
arr = [int(input()) for _ in range(n)]

def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])

    return merge(left, right)

def merge(left, right):
    result = []
    i = 0
    j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    if i < len(left):
        result += left[i:]
    if j < len(right):
        result += right[j:]
    return result

arr = merge_sort(arr)

for i in range(n):
    print(arr[i])