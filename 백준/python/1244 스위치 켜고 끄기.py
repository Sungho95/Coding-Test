def switch_change(num):
    if switch_state[num] == 0:
        switch_state[num] = 1
    else:
        switch_state[num] = 0
    return


switch_num = int(input())
switch_state = [-1] + list(map(int, input().split()))

std = int(input())
for _ in range(std):
    gender, num = map(int, input().split())

    if gender == 1:
        for i in range(num, switch_num + 1, num):
            switch_change(i)

    else:
        switch_change(num)

        for j in range(switch_num // 2):
            if num - j < 0 or num + j > switch_num:
                break
            if switch_state[num - j] == switch_state[num + j]:
                switch_change(num + j)
                switch_change(num - j)
            else:
                break

for i in range(1, switch_num + 1):
    print(switch_state[i], end=' ')
    if i % 20 == 0:
        print()
