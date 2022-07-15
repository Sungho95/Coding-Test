def solution(nums):
    possible = len(nums) // 2
    value = len(set(nums))

    if possible >= value:
        answer = value
    else:
        answer = possible

    return answer