# n = int(input())
# k = (n-1)/6

# i=0
# while i*(i+1)/2<k:
#     i+=1

# print(i+1)



n=int(input())
result =1
i=1
while result<n:
    result = result+6*i
    i=i+1
print(i)