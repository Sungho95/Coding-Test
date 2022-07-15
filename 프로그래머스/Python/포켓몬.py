def solution(nums):
    answer = 0
    possible = len(nums) // 2
    value = len(set(nums))

    if possible >= value:
        answer = value
    else:
        answer = possible

    return answer