a = int(input())
b = int(input())
c = int(input())



l = list(str(a*b*c))
for i in range(0,10):
    print(l.count(str(i)))
