t = int(input())

for tc in range(1, t+1):
    n = int(input())
    arr = list(map(int, input().split()))[::-1]
    now = arr[0]
    result = 0

    for i in range(1, n):
        if now > arr[i]:
            result += now - arr[i]
        else:
            now = arr[i]

    print('#%d %d' % (tc, result))