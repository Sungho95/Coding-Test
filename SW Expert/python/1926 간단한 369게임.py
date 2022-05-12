#1
n = int(input())

for i in range(1, n+1):
    i = str(i)
    temp = i.count('3') + i.count('6') + i.count('9')

    if temp == 0:
        print(i, end=' ')
    else:
        print('-' * temp, end=' ')

#2
n = int(input())

for i in range(1, n+1):
    cnt = 0

    for j in str(i):
        if j in ['3', '6', '9']:
            cnt += 1
    if cnt == 0:
        print(i, end=' ')
    else:
        print('-' * cnt, end=' ')