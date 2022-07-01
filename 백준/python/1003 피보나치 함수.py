def fibo_call(num):
    length = len(zero)
    if num >= length:
        for i in range(length, num + 1):
            zero.append(zero[i-1] + zero[i-2])
            one.append(one[i-1] + one[i-2])

    answer[0], answer[1] = [zero[num], one[num]]
    return answer

zero = [1, 0, 1]
one = [0, 1, 1]
answer = [0, 0]

t = int(input())
for tc in range(t):
    fibo_call(int(input()))
    print("%d %d" % (answer[0], answer[1]))