# testCase = int(input())

# result = []
# for n in range(testCase):
#     a,b = map(int,input().split())
#     result.append(a+b)
    
# for x in result:
#     print(x)


#반복문에서 input으로 입력받을 시 시간초과 발생가능하므로 sys.stdin.readline() 사용

#단일이라 input()으로 받아도 상관없다\
import sys
testCase = int(input())

for n in range(testCase):
    a,b = map(int, sys.stdin.readline().split())
    
    print(a+b)