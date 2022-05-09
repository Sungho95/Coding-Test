t = int(input())

for tc in range(1, t+1):
    n, d = map(int, input().split())
    cnt = n // ((d * 2) + 1)

    if n % ((d*2) + 1) > 0:
        cnt += 1

    print('#%d %d' % (tc, cnt))