#Mini Project about computer Quiz
# Data01data01 Defenition
import data01
#coding Starts
import random
print("Hello Welcome! for the knowledge quest")
desicion=input("Do you wannan start the game ? ")
if desicion.upper()=="YES":
    print("Loading Game ....")
else:
    print("Thank you")
    quit()
# Entering the game
for i in range(0,5):
    a=i
    print(data01.quest[a])
    ans=input("Enter your answer : ")
    if(ans==data01.answer[a]):
        print("C")
        a+=1
    else:
        a-=0.25
#result
if(a>2.25):
    print("You have Passes the Test ! ! ! !")
else:
    print("You have not passed the Test")