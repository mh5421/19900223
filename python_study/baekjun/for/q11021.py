t = int(input())

import sys

for x in range(1,t+1):
    a,b = map(int, sys.stdin.readline().split())
    # print("Case #",end="")
    # print(x,end="")
    # print(":",a+b)
    
    print("Case #{}: {}".format(x,(a+b)))