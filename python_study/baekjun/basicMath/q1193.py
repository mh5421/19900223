# n = int(input())

# a = []
# b = []

# for i in range(1,n+1):
#     x = 4*(i-1)+1
#     j=1
#     while x//2+1>j:
#         a.append(j)
#         j+=1
#     while j>=1:
#         a.append(j)
#         j-=1


# for i in range(1, n+1):
#     y = 4*(i-1)+3
#     j=1
#     while y//2+1>j:
#         b.append(j)
#         j+=1
#     while j>=1:
#         b.append(j)
#         j-=1       
  
# print(str(a[n-1])+"/"+str(b[n-1]))

# n=int(input())

# sum=0
# orda=0
# ordb=0

# for i in range(1,n+1):
#     sum+=i
#     if sum>=n:
#         orda=i
#         ordb=n-(sum-i)
#         print(orda, ordb)
#         break

# a=0
# b=0
# if orda%2!=0:
#     a=orda+1
#     b=0
    
#     for j in range(ordb):
#         a-=1
#         b+=1

# elif orda%2==0:
#     a=0
#     b=orda+1

#     for j in range(ordb):
#         b-=1
#         a+=1
           

# print(a,b,sep="/")

n = int(input())

line = 0
max_num = 0
while n > max_num:
    line+=1
    max_num += line

a=0
b=0
if line%2 != 0: 
    a=1
    b=line
    
    while max_num > n:
        a+=1
        b-=1
        max_num -= 1
    
elif line%2 == 0:
    a=line
    b=1
    
    while max_num > n:
        a-=1
        b+=1
        max_num -=1
        
print(a,b,sep="/")