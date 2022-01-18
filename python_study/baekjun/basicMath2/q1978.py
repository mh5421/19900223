# def sosuSearch(x: int) -> bool:
#     if x == 1:
#         return False
#     if x % 2 == 0 and x != 2:
#         return False
#     for i in range(3, int(x**(1/2)+1), 2): 
#         if x % i == 0:
#             return False
#     return True

# N = int(input())
# nums = list(map(int, input().split()))

# for num in nums:
#     if sosuSearch(num) == False:
#         nums.remove(num)
        
# print(len(nums))


ans = int(input())
num = list(map(int, input().split()))
for n in num:
    if n == 1:
        ans -= 1
        continue
    for i in range(2,int(n**0.5)+1):
        if n%i == 0:
            ans -= 1
            break
print(ans)