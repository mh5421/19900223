a,b  = input().split()

if "".join(reversed(a)) > b[::-1]:
    print("".join(reversed(a)))
else:
    print(b[::-1])
    
# print(max(a[::-1], b[::-1]))