#백준 단계별로 풀어보기 2753번 윤년 문제
year = int(input());
if year%4 == 0 and (year%100 != 0 or year%400 == 0):
    print("1")
else:
    print("0")