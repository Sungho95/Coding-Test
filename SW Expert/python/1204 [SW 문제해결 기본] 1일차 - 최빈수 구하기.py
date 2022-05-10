t = int(input())

for tc in range(1, t+1):
    case_num = int(input())
    score = list(map(int, input().split()))
    temp = [0] * 101
    max_temp = 0
    result = 0

    for i in range(len(score)):
        temp[score[i]] += 1

    for j in range(len(temp)):
        if max_temp <= temp[j]:
            max_temp = temp[j]
            result = j

    print('#%d %d' % (tc, result))