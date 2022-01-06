n = int(input())
 
import sys
 
l = list(map(int,sys.stdin.readline().split()))

print((sum(l)/max(l)*100)/n)
