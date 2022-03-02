import math

def isPrime(num):
    if num == 1:
        return 0
    else:
        for i in range(2, int(math.sqrt(num)) + 1):
            if num % i == 0:
                return 0
        return 1


t = int(input())
for _ in range(t):
    n = int(input())
    a = n // 2
    b = n // 2

    for i in range(n // 2):
        if isPrime(a) == 1 and isPrime(b) == 1:
            if a + b == n:
                print(a, b)
                break
        else:
            a -= 1
            b += 1