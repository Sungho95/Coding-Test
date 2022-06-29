import math
import itertools


def is_prime(num):
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True


def solution(nums):
    answer = 0
    prime_number = []
    for i in itertools.combinations(nums, 3):
        prime_number.append(sum(i))

    for i in prime_number:
        if is_prime(i):
            answer += 1
        else:
            continue

    return answer