def dfs(num, x, y):
    if len(num) == 7:
        result.add(num)
        return

    for k in range(4):
        nx = x + dx[k]
        ny = y + dy[k]

        if 0 <= nx < 4 and 0 <= ny < 4:
            dfs(num + arr[nx][ny], nx, ny)

t = int(input())
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

for tc in range(1, t+1):
    arr = [input().split() for _ in range(4)]
    result = set()

    for i in range(4):
        for j in range(4):
            dfs('', i, j)

    print('#%d %d' % (tc, len(result)))