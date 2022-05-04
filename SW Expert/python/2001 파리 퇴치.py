t = int(input())
for case in range(t):
    n, m = map(int, input().split())
    arr = [list(map(int, input().split())) for i in range(n)]
    result = 0

    for i in range(n - m + 1):
        for j in range(n - m + 1):
            temp = 0

            for a in range(i, i + m):
                for b in range(j, j + m):
                    temp += arr[a][b]

            if temp > result:
                result = temp

    print('#%d %d' % (case + 1, result))