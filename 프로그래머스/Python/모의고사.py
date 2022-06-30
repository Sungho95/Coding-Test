def solution(answers):
    answer = []

    one = []
    two = []
    two_n = 1
    three = []

    cnt1 = 0
    cnt2 = 0
    cnt3 = 0

    for i in range(len(answers)):
        if i % 5 == 0:
            one.append(1)
        else:
            one.append((i % 5) + 1)

        if i % 2 == 0:
            two.append(2)
        else:
            two.append(two_n)
            two_n += 1
            if two_n == 2:
                two_n += 1
            elif two_n > 5:
                two_n = 1

        if i % 10 == 0 or i % 10 == 1:
            three.append(3)
        elif 2 <= i % 10 <= 3:
            three.append(1)
        elif 4 <= i % 10 <= 5:
            three.append(2)
        elif 6 <= i % 10 <= 7:
            three.append(4)
        else:
            three.append(5)

    for i in range(len(answers)):
        if answers[i] == one[i]:
            cnt1 += 1
        if answers[i] == two[i]:
            cnt2 += 1
        if answers[i] == three[i]:
            cnt3 += 1

    max_n = max(cnt1, cnt2, cnt3)

    if cnt1 == max_n:
        answer.append(1)
    if cnt2 == max_n:
        answer.append(2)
    if cnt3 == max_n:
        answer.append(3)

    return answer
