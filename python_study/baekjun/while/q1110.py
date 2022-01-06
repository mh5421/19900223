import sys

a = int(sys.stdin.readline())
z = a
count=0
while True:
    b = a//10
    c = a%10
    
    a = c*10+(b+c)%10
    count += 1
    if a == z:
        print(count)
        break