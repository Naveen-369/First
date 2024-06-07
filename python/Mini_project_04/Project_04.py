#Construct a password manager
#define salt
#define view 
#define Add
import Func
#get the masterpassword
print("Welcome to the K-Groups Password Manager :)")
masterpassword=input("Enter your master Password : ")
choice=0
while (choice!=3):
    choice=int(input("\n1.Add\n2.View\n3.Exit\nEnter Your Fucntion : "))
    if(choice==1):
        Func.add(masterpassword)
    elif(choice==2):
        Func.view(masterpassword)
    elif(choice==3):
        print("Thank you for using our service")
    else:print("Enter a Valid Input ! ! ! !")
print("Thank you for your precious time with us !!!")
