h,m = map(int,input().split())

if m-45<0:
    h=h-1

m=m+15

if m>=60:
    m=m-60
if h>23:
    h=h-24
elif h<0:
    h=h+24

print(h,m)