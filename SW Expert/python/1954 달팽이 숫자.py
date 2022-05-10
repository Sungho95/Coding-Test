def di_change():
    global direction
    direction += 1
    if direction == 4:
        direction = 0


t = int(input())

for tc in range(1, t + 1):
    n = int(input())
    arr = [[0] * n for _ in range(n)]
    direction = 0

    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    x = 0
    y = 0
    arr[x][y] = 1
    temp = 1

    while True:
        nx = x + dx[direction]
        ny = y + dy[direction]
        if 0 <= nx < n and 0 <= ny < n and arr[nx][ny] == 0:
            temp += 1
            arr[nx][ny] = temp
            x = nx
            y = ny
            continue
        di_change()

        if temp == n ** 2:
            break

    print('#%d' % (tc))
    for i in arr:
        print(*i)