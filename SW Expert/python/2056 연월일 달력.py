t = int(input())

for tc in range(1, t+1):
    ymd = input()

    if int(ymd[4:6]) > 12 or int(ymd[4:6]) < 1:
        print('#%d %d' % (tc, -1))
        continue

    elif ymd[4:6] in ['01', '03', '05', '07', '08', '10', '12']:
        if int(ymd[6:]) > 31 or int(ymd[6:]) < 1:
            print('#%d %d' % (tc, -1))
            continue

    elif ymd[4:6] in ['04', '06', '09', '11']:
        if int(ymd[6:]) > 30 or int(ymd[6:]) < 1:
            print('#%d %d' % (tc, -1))
            continue

    elif ymd[4:6] == '02':
        if int(ymd[6:]) > 28 or int(ymd[6:]) < 1:
            print('#%d %d'% (tc, -1))
            continue

    print('#%d %s/%s/%s' % (tc, ymd[0:4], ymd[4:6], ymd[6:]))