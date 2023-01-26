a=int(input("Enter the number of kilometer driven :"))
if (a<=100):
    print("Rs.20")
elif (101<=a<=500):
    print("Rs.50")
elif (501<=a<=800):
    print("Rs.80")
elif (801<=a<=1000):
    print("Rs.100")
elif (1001<=a<=1500):
    print("Rs.150")
elif (1501<=a<=2000):
    print("Rs.200")
elif (2001<=a<=5000):
    print("Rs.400")
elif (5001<=a<=10000):
    print("Rs.750")
else:
    print("Rs.1000")
    