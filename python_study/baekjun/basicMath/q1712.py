import sys

a,b,c = map(int, sys.stdin.readline().split())
i = 0

if b>=c:
    print(-1)
else:
    result = a//(c-b)+1

