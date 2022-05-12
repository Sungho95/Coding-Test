t = int(input())

for tc in range(1, t+1):
    s = input()
    madi = ''
    for i in s:
        madi += i
        if madi == s[len(madi):len(madi)*2]:
            print('#%d %d' % (tc, len(madi)))
            break