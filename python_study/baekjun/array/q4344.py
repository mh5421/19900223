t = int(input())

import sys

for i in range(t):
    l = list(map(int,sys.stdin.readline().split()))
    m = l[0] #학생수
    count = 0 
    del l[0] #학생수 제거
    
    avg = sum(l)/m
    for n in l:
        if n > avg :
            count += 1
    print('{:.3f}%'.format(count/m*100))