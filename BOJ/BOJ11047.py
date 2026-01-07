"""
2026.01.07
BOJ 11047 - 동전 0
https://www.acmicpc.net/problem/11047
Greedy
"""

N, K = map(int, input().split())
coins = []
for i in range(N):
    coin = int(input())
    coins.append(coin)

coins.reverse()

ans = 0
for coin in coins:
    if coin <= K:
        count = K // coin
        K -= coin * count
        ans += count

    if K == 0:
        break

print(ans)