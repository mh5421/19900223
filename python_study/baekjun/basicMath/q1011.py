import math
N = int(input())
for index in range(N):
    x,y = map(int,input().split())
    dis = y - x
    close = math.floor(math.sqrt(dis))
    step = close*2 -1
    remain = dis - close*close
    if remain != 0:
        if remain <= close:
            step+=1
        else:
            step+=2
    print(step)