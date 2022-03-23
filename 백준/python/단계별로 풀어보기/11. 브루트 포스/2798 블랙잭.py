n, m = map(int, input().split())
my_card = list(map(int, input().split()))

temp = []
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            if my_card[i] + my_card[j] + my_card[k] <= m:
                temp.append(my_card[i] + my_card[j] + my_card[k])
print(max(temp))