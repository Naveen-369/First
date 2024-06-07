#Constrct a rock--Paper--Scissor game
import random
outcome={"Scissor":"Paper","Stone":"Scissor","Paper":"Stone"}
out=["Paper","Stone","Scissor"]
score=a=0
while (score<=5):
    a+=1
    computer=random.choice(out)
    mine=int(input("\n1.Stone\n2.Paper\n3.Scissor\nEnter your choice : "))
    if(mine==1):
        mine="Stone"
    elif(mine==2):
        mine="Paper"
    elif(mine==3):
        mine="Scissor"
    else:
        print("\nPlease Enter a valid Choice !!!!!")

    print("\nComputer Chose "+computer)
    #Condition declaration
    if(mine==computer):
        print("Draw Both are same!!!")
    elif(outcome[mine]==computer):
        score+=1
        print("You Won :)  ! ! !")
    else:
        print("You Lost :(  ! ! !")
        score-=0.5
print("Score: "+str(score)+"\nWon After "+str(a)+" Choices ")