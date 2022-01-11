a = input()

total = 0
for i in a:
    total += "ABC".count(i)*3 + "DEF".count(i)*4 + "GHI".count(i)*5 + "JKL".count(i)*6 + "MNO".count(i)*7 + "PQRS".count(i)*8 + "TUV".count(i)*9 + "WXYZ".count(i)*10
    
print(total)