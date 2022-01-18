def sugar(kg,turn):
    if kg ==0:             #종료조건
        return turn
    if kg<0:
        return -1
    if kg%5 !=0:
        return sugar(kg-3,turn+1)
    elif kg%3 !=0:
        return sugar(kg-5,turn+1)
    elif kg%5==0:
        return sugar(0,turn+kg//5)
    elif kg%3==0:
        return sugar(0,turn+kg//3)
    
kg = int(input())
t = sugar(kg,0)
print(t)