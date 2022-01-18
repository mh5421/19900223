m = int(input())
n = int(input())

l = []
for i in range(m, n+1):
    l.append(i)
for j in l[:]:
  if j == 1:
    l.remove(j)
    continue
  for x in range(2,int(j**0.5)+1):
      if j%x == 0:
        l.remove(j)
        break
if len(l) == 0:
    print(-1)
else:    
  print(sum(l))
  print(min(l))
