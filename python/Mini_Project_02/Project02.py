#Construct a number guesser game 
#Creates a Random lucky number 
import random
enterkey=input("**Press Enter To Start The Game**")
print("\nWelcome to the Word Guesser 2023")
self=random.randint(0,10)
#Gets the input from the user
user=0
flag=0
step=0
#Get the input until they get correct number
while (flag==0):
    step+=1
    user=input("\n\nEnter a number to check your luck within the range of 10 : ")
    if(user.isdigit() and int(user)>0):
        user=int(user)
    else:
        print("Entered Invalid Number in the console pls enter the number next time !!!")
        quit()
    if(user!=self):
        print("Sorry ! ! !\tBetter luck next time :(\n\t\tThe lucky numer is "+str(self))
        if(user>self):
            print("\t\tYou are "+str(user-self)+" Step forward from the lucky number")
        else:
            print("\t\tYou are "+str(self-user)+" Step Backward the lucky number")
    else:
        print("\t\t\tYou are lucky")
        print("\t\t  You got it in "+str(step)+" Steps")
        flag+=1
    self=random.randint(0,10)
print("\nThank you have a nice day :) ")