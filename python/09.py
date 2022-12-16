word=input("Enter a string : ")
vowels=["a","i","e","o","u","A","I","E","O","U"]
str=""
for i in vowels:
    f=word.replace(i, "")
    word=f
print(f)