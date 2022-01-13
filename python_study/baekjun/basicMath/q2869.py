import math 
a,b,c = map(int, input().split())

count = math.ceil((c-a)/(a-b)) +1
print(count)