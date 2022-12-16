l1=eval(input("Enter the list of elements : "))

def unpack(l1):
    d=0
    count = 0
    for i in l1:
        if type(i) == list:
            count += (len(i)-1)
        else:
            d+=1
    if d==len(l1):
        print("Cannot unpack")
    else:
        fu= count+len(l1)
        return(fu)
            
print(unpack(l1))