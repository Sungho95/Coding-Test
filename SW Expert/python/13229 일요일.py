t = int(input())

sunday_dict = {'MON': 6, 'TUE': 5, 'WED': 4, 'THU': 3, 'FRI': 2, 'SAT': 1, 'SUN': 7}

for tc in range(1, t+1):
    s = input()
    print('#%d %d' % (tc, sunday_dict[s]))