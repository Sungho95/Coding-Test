def solution(numbers, hand):
    answer = ''
    dict_numbers = {1: [0, 0], 2: [0, 1], 3: [0, 2],
                    4: [1, 0], 5: [1, 1], 6: [1, 2],
                    7: [2, 0], 8: [2, 1], 9: [2, 2],
                    '*': [3, 0], 0: [3, 1], '#': [3, 2]}

    left_last = dict_numbers['*']
    right_last = dict_numbers['#']

    for i in numbers:
        now = dict_numbers[i]

        if i in [1, 4, 7]:
            answer += 'L'
            left_last = now
        elif i in [3, 6, 9]:
            answer += 'R'
            right_last = now
        else:
            left_distance = 0
            right_distance = 0

            for a, b, c in zip(left_last, right_last, now):
                left_distance += abs(a-c)
                right_distance += abs(b-c)

            if left_distance < right_distance:
                answer += 'L'
                left_last = now
            elif left_distance > right_distance:
                answer += 'R'
                right_last = now
            else:
                if hand == 'left':
                    answer += 'L'
                    left_last = now
                else:
                    answer += 'R'
                    right_last = now

    return answer