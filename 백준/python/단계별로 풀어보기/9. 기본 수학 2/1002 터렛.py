import math

t = int(input())
for _ in range(t):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    # 좌표 평면에서 두 점 사이의 거리
    d = math.sqrt(((x2 - x1) ** 2) + ((y2 - y1) ** 2))

    # 동심원 & r1 == r2
    if d == 0 and r1 == r2:
        print(-1)
    # 내접 or 외접이면 교점은 1개
    elif abs(r1 - r2) == d or r1 + r2 == d:
        print(1)
    # 교점이 2개일 때, r1 - r2 < d < r1 + r2
    elif abs(r1 - r2) < d < r1 + r2:
        print(2)
    # 교점이 0일 때
    elif r1 + r2 < d or abs(r1 - r2) > d:
        print(0)