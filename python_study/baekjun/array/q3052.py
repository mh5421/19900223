import sys
l = [int(sys.stdin.readline())%42 for i in range(10)]

print(len(set(l)))