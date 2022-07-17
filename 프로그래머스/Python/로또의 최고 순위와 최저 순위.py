def solution(lottos, win_nums):
    answer = []
    temp = []
    count = 0
    for i in lottos:
        if i in win_nums:
            count += 1
    temp.append(count + lottos.count(0))
    temp.append(count)

    for j in temp:
        if j < 2:
            answer.append(6)
        elif j == 2:
            answer.append(5)
        elif j == 3:
            answer.append(4)
        elif j == 4:
            answer.append(3)
        elif j == 5:
            answer.append(2)
        else:
            answer.append(1)

    return answer