import sys
from collections import deque
input = sys.stdin.readline

h, w = map(int, input().split()) # h: 세로, w: 가로

cheese = [list(map(int, input().split())) for _ in range(h)]

dx = [-1, 0, 1, 0]
dy = [0, -1, 0, 1]
ans = []

def bfs():
    queue = deque()
    queue.append([0, 0])
    visited[0][0] = 1
    count = 0
    # while문 끝날 때마다 1시간
    while queue:
        x, y = queue.popleft()
        # 방문칸의 상하좌우 확인
        for i in range(4):
            hx = x + dx[i]
            hy = y + dy[i]
            if 0 <= hx < h and 0 <= hy < w and visited[hx][hy] == 0:
                if cheese[hx][hy] == 0:
                    visited[hx][hy] = 1
                    queue.append([hx, hy])
                elif cheese[hx][hy] == 1:
                    cheese[hx][hy] = 0
                    visited[hx][hy] = 1
                    count += 1
    ans.append(count)
    return count

time = 0
while 1:
    time += 1
    visited = [[0] * w for _ in range(h)]
    count = bfs()
    if count == 0:
        break
print(time - 1)
print(ans[-2])