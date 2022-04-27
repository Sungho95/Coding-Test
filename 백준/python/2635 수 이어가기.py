n = int(input())

long_list = []
for i in range(1, n+1):
    check_list = [n]
    check_list.append(i)

    idx = 1
    while True:
        next_num = check_list[idx - 1] - check_list[idx]
        if next_num < 0:
            break
        check_list.append(next_num)
        idx += 1

    if len(long_list) < len(check_list):
        long_list = check_list

print(len(long_list))
for i in long_list:
    print(i, end=' ')