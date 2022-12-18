pan=input("Enter a valid PAN number : ")
if len(pan)!=10:
    print("Invalid")
a=pan[0:4]
b=pan[-1]
if a.isupper()and b.isupper():
    e=1
else:
    e=0
    print("Invalid")
if e==1 and pan[5:9].isnumeric():
    print("Valid")