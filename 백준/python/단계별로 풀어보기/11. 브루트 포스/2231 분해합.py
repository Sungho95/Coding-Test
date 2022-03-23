n = int(input())

for i in range(1, n+1):
    add = 0
    for j in range(len(str(i))):
        add += int(str(i)[j])
    result = i + add
    if result == n:
        print(i)
        break
    if i == n:
        print(0)