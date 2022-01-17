




for t in range(int(input())):
    k = int(input())
    n = int(input())
    
    result = 0
    zerofloor = []
    
    for i in range(1,n+1):
        zerofloor.append(i)
        
    
    tempfloor = []
    thisfloor = []
    for j in range(1,k+1):
        if j == 1:
            thisfloor = zerofloor
        else:
            tempfloor = thisfloor
            thisfloor = []
            for i in range(n): # k=2부터
                if len(thisfloor) <1:
                    thisfloor.append(1)
                else:
                    thisfloor.append(tempfloor[i] + thisfloor[i-1])
                
                    
    print(sum(thisfloor))

       