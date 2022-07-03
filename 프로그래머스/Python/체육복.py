def solution(n, lost, reserve):
    answer = n - len(lost)

    lost.sort()
    reserve.sort()

    for i in range(len(lost)):
        if lost[i] in reserve:
            reserve.remove(lost[i])
            lost[i] = -1
            answer += 1

    for i in range(len(lost)):

        if lost[i] in reserve:
            lost.remove(lost[i])
            reserve.remove(lost[i])
            answer += 1
        if lost[i] - 1 in reserve:
            answer += 1
            reserve.remove(lost[i] - 1)
            continue
        if lost[i] + 1 in reserve:
            answer += 1
            reserve.remove(lost[i] + 1)
            continue

    return answer