import csv
import random
import string
#Salting Function
def salt(word1,password):
    cipher=""
    common=string.ascii_lowercase+string.digits+string.ascii_uppercase+string.punctuation
    common=common.replace("|"," ")
    common=list(common)
    key=common.copy()
    random.shuffle(key)
    row=[password+" | "+"".join(key)]
    with open("E:\cprojects\Python\Mini_project_04\Cistec.csv",'a') as c:
        csv.writer(c).writerow(row)
    for letter in word1:
        index=common.index(letter)
        cipher+=key[index]
    return cipher
#Function to add data to database
def add(masterpassword):
    with open ("E:\cprojects\Python\Mini_project_04\database.txt",'a') as f:
        name=input("Enter your Username : ")
        password=input("Enter the password ")
        f.write(name+" | "+salt(password,masterpassword)+"\n")
#Function to read the data from the database
def view(passmaster):
    with open("E:\cprojects\Python\Mini_project_04\Cistec.csv", 'r') as f:
        csvreader=csv.reader(f)
        for lines in csvreader:
            strr="".join(lines)
            master=strr.split(' | ')
            if(master[0]==passmaster):
                masterreference=master[1]
                masterkey=master[0]
        disolve(masterreference)
    
#desolve function
def disolve(masterrefeernce):
    flag=0
    ret=""
    keyy=masterrefeernce
    namee=input("Enter User Name")
    book=string.ascii_lowercase+string.digits+string.ascii_uppercase+string.punctuation
    book=book.replace("|"," ")
    with open ("E:\cprojects\Python\Mini_project_04\database.txt",'r') as elang:
        f=elang.readlines()
        for lines in f:
            name,key=lines.split(' | ')
            key=key.rstrip()
            if(name!=namee):
                continue
            else:
                flag+=1
                for letter in key:
                    index=keyy.find(letter)
                    ret+=book[index]
        if(flag==0):
            print("! ! ! Please create an user account before fetching the sensitive data ! ! ! ")
        else:
            print("The password is : "+ret)