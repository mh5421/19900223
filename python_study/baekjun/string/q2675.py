import sys

t = int(input())

for i in range(t):    
    a,b = sys.stdin.readline().split()
    b = list(b.strip())
    for x in range(len(b)):
        print(b[x] * int(a), end="")
    print()