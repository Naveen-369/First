import string
password=tuple(input("Enter your Passwords that are to be checked whether valid or invalid : ").split(','))
a=tuple(string.ascii_lowercase)
b=tuple('0123456789')
c=tuple(string.ascii_uppercase)
d=tuple('$#@')
p = q = r = s = t = 0

valid_pwd = tuple()
correct_pwd = True

for i in password:
    if len(i) < 6 or len(i) > 12:
        correct_pwd = False
    else:
        for j in i:
            if j in a:
                p += 1
            elif j in b:
                q += 1
            elif j in c:
                r += 1
            elif j in d:
                s += 1


    if correct_pwd and p*q*r*s != 0:
        print(i, end ="") if t == 0 else print(f",{i}", end = "")
        t = 1

if t == 0:
    print("invalid")
