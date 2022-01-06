import sys

def selfnum(n):
    total = n
    
    while True:
        if n == 0:
            break
        total += n%10
        n = n//10

    return total

lists = set()
num = set(range(1,10001))
for i in range(1, 10001):
    idx = selfnum(i)
    
    lists.add(idx)

num = num - lists
for x in sorted(num):
    print(x)