def fibo(num):
    if num == 0 or num == 1:
        return num
    else:
        return fibo(num - 2) + fibo(num - 1)


print(fibo(int(input())))