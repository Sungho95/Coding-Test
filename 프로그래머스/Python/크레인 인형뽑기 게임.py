def solution(board, moves):
    answer = 0
    poket = []

    for i in moves:
        row = 0
        col = i - 1
        while row < len(board):
            if board[row][col] != 0:
                poket.append(board[row][col])
                board[row][col] = 0
                break
            row += 1

        if len(poket) >= 2 and poket[-1] == poket[-2]:
            del poket[-1]
            del poket[-1]
            answer += 2

    return answer