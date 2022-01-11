a = input()
a = a.upper()

l = list(a)

maxCheck = False

maxnum = 0
for i in set(l):
    if a.count(i)>maxnum:
        maxnum = a.count(i)
        maxCheck = True
        result = i
    elif a.count(i) == maxnum:
        maxCheck = True
        result = "?"

print(result)