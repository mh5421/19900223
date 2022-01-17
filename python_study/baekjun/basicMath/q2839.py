n = int(input())

a = 0
b = 0
c = 0
d = 0
if (n%5)%3 != 0 and n%3 !=0 and n%5 != 0 and n%10%3 != 0:
    print(-1)
else:
    if (n%5)%3 == 0:
       a =  n%5//3+n//5
    if n%3 == 0:
        b = n//3
    if n%5 == 0:
        c = n//5
    if n%10%3 == 0:
        d = n%10//3 + n//10*2
    print(max(a,b,c,d))