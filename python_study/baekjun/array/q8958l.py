t = int(input())

import sys


for j in range(t):
    l = list(sys.stdin.readline().rstrip())
    score = 0
    total = 0
    for i in list(l):
        if i == 'O':
            score += 1
        elif i=='X':
            score = 0
            
        total += score
    print(total)