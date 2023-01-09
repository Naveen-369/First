''' Write a python program to accept two lists namely product and price of 
10 products, print in the following form. '''
#Declararation
pro=eval(input("Enter the list of products : "))
price=eval(input("Enter the price of the products in the same order : "))
for i in range (10):
    print(pro[i],"-",price[i])
    print("\n\n")
    print("--------------")
    print("\n\n")