a = input()

l = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

total = 0
for i in l:    
    total += a.count(i)
    
print(len(a)-total)

# c=input().count;
# print(c('')-1-sum(map(c,['-','=','nj','lj','dz='])))