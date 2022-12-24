def entry():
    count=1
    while count==1:
        file=open("credentials.txt", "r")
        user_name=input("Enter your Username : ")
        password_getin=input("Enter your Password : ")
        word=user_name+","+password_getin
        a=0
        l=file.readlines()
        for i in l:
            l2=i
            if word in l2:
                print("Welcome Back ")
                a=1 
                count+=1
        if a!=1:
            print(" Invalid Username or Password ")
            count==1

def book():
    regular_s = 12
    takal_s =3
    destination={"Hosur":75,"Vaniyambadi":250,"Vellore":500,"Walaja":600,"Chennai":750}
    print("A.Regular(",regular_s," Seats Available)")
    print("B.Takal(",takal_s," Seats Available)")
    cho=input("Enter your Prefered booking system :  ")
    if cho=="A":
        if regular_s <=0:
            print("Sorry you came late! Beter luck mext time .")
        else:
            regular_s=regular_s-1
            pr="Regular seat"
    if cho=="B":
        if takal_s <=0:
            print("Sorry you came late! Beter luck mext time .")
        else:
            takal_s=takal_s-1
            pr="Takal seat"
    dest=input("Hosur\tVaniyambadi\tVellore\t Walaja\t Chennai\nEnter your Destination : ")
    amt=destination[dest]
    name=input("Enter your Name : ")
    date=input("Enter the Date u want to travel  : ")
    age=int(input("Enter your age : "))
    if age>=60:
        amt=amt-(amt*0.6)
    import random
    v=random.randint(65,90)
    coach=chr(v)
    breath=random.randint(1,100)
    seat=str(coach)+str(breath)
    print(name,"-",age,"-","Bangalore -",dest,"-",seat,"-",pr)
    print("The Amount to be paid : ",amt)
    n=name
    a=str(age)
    d=str(dest)
    s=str(seat)
    p=str(pr)
    detail=n+' - '+a+' - Bangalore'+' - '+d+' - '+s+' - '+p+' - '+date
    detail=detail+".\n"
    gh=open("Clients.txt", "a")
    gh.write(detail)
    gh.close()
    
def cancel():
    import os
    dl=input("Enter your seat number : ")
    w=open("Clients.txt", "r")
    d=open("Clients1.txt","w")
    s=" "
    count=1
    line=w.readlines()
    for i in line:
        l2=i.split(" - ")
        if dl in l2:
            print("---**Successfully Canceled **---")
        else:
            d.write(i)
    d.close()
    print("The remaining reserations are : ")
    with open("Clients1.txt", "r") as sa:
        gho=sa.readlines()
        print(gho)
        
def buy():
    n=int(input("Enter the Number of Client : "))
    amt_tobe_paid=0
    hu=""
    for i in range(n):
        cid=int(input("Enter the customber ID : "))
        product=input("Enter the Product : ")
        quality=int(input("Enter the Quantity : "))
        rate=float(input("Enter the rate of per quality : "))
        total_price=quality*rate
        amt_tobe_paid=amt_tobe_paid+total_price
        a=str(cid)
        b=product
        c=str(quality)
        d=str(rate)
        e=str(total_price)
        dl=a+","+b+","+c+","+d+","+e
        v=open("details.txt","a")
        dl=dl+"\n"
        v.write(dl)
    v.write("Thank you for using this program.")
    v.write("\n\n\n")
    tamt=str(amt_tobe_paid)
    v.write(tamt)
    v.close()
    

