t = int(input())

import sys
for x in range(t):
    a,b = map(int, sys.stdin.readline().split())
    print("Case #{}: {} + {} = {}".format((x+1),a,b,(a+b)))