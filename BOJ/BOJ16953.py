"""
2026.01.07
BOJ 16953 - A->B
https://www.acmicpc.net/problem/16953
Silver 2 - Greedy
"""

A, B = map(int, input().split())

ans = -1
count = 0
while B >= A:
    if B == A:
        count += 1
        ans = count
        # print("같다")
        break
    elif B % 2 == 0:
        # print(B, A)
        # print(int(B / 2))
        # print()
        B = int(B / 2)
        count += 1
    elif B % 10 == 1:
        # print(B, A)
        # print(int(B / 10))
        # print()
        B = int(B / 10)
        count += 1
    else:
        break
print(ans)