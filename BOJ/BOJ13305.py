"""
2026.01.07
BOJ 13305 - 주유소
https://www.acmicpc.net/problem/13305
Silver 3 - Greedy
"""

N = int(input())
dist = list(map(int, input().split()))
cost = list(map(int, input().split()))

min_cost = cost[0]
ans = 0
for i in range(N - 1):
    if cost[i] < min_cost:
        min_cost = cost[i]
    ans += min_cost * dist[i]

print(ans)