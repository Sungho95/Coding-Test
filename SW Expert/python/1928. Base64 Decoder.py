decode = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
          'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
          'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
          'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
          'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
          'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
          'w', 'x', 'y', 'z', '0', '1', '2', '3',
          '4', '5', '6', '7', '8', '9', '+', '/']

t = int(input())

for t in range(1, t+1):
    s = list(input())
    bin_s = ''
    for i in range(len(s)):
        num = decode.index(s[i])
        bin_num = str(bin(num)[2:])

        while len(bin_num) < 6:
            bin_num = '0' + bin_num
        bin_s += bin_num

    result = ''

    for j in range((len(s) * 6) // 8):
        encode = int(bin_s[j*8:j*8+8], 2)
        result += chr(encode)

    print('#%d %s' % (t, result))