from collections import Counter
import sys
input = sys.stdin.readline

n = int(input())
arr = [int(input()) for _ in range(n)]
arr.sort()
cnt = Counter(arr).most_common()

print(round(sum(arr) / n))
print(arr[len(arr) // 2])
if len(cnt) > 1 and cnt[0][1] == cnt[1][1]:
    print(cnt[1][0])
else:
    print(cnt[0][0])
print(max(arr) - min(arr))