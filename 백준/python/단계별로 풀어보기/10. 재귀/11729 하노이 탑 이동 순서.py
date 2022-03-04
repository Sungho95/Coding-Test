def hanoi(n, start, to):
    if n == 1:
        print(start, to)
    else:
        hanoi(n-1, start, 6-start-to)
        print(start, to)
        hanoi(n-1, 6-start-to, to)

n = int(input())
print((2 ** n) - 1)
hanoi(n, 1, 3)