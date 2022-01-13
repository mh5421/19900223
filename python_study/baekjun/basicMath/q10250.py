# t = int(input())


# for i in range(t):
#     h,w,n = map(int, input().split())   

#     if n%h == 0:
#         if n//h < 10:
#             print(h, n//h,sep="0")
#         else:
#             print(h, n//h, sep="")
#     else:
#         if n%h == 1:
#             if n//h<9:
#                 print(n%h, n//h+1, sep="0")    
#             else : 
#                 print(n%h, n//h+1, sep="")
#         else:
#             if n//h<9:
#                 print(n%h, n//h+1, sep="0")
#             else :
#                 print(n%h, n//h+1, sep="")
                
for i in range(int(input())):
    h,w,n = map(int, input().split()) 
    
    print("%d%02d" % ((n-1)%h+1, (n-1)//h+1))
    
    
     