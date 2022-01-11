n = int(input())
result = 0


for j in range(n):
    a = input()
    total = False    
    for i in set(a):
        if a.rindex(i) != a.index(i)+a.count(i)-1:
            total = True
    
    if total != True:
        result += 1
    
print(result)                
