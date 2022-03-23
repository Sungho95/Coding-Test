n, m = map(int, input().split())
board = []
result = []

for _ in range(n):
    board.append(input())

for i in range(n-7):
    for a in range(m-7):
        draw1 = 0
        draw2 = 0
        for j in range(i, i+8):
            for b in range(a, a+8):
                if (j + b) % 2 == 0:
                    if board[j][b] != 'B':
                        draw1 += 1
                    if board[j][b] != 'W':
                        draw2 += 1
                else:
                    if board[j][b] != 'W':
                        draw1 += 1
                    if board[j][b] != 'B':
                        draw2 += 1
        result.append(draw1)
        result.append(draw2)

print(min(result))