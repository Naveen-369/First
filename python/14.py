import All
All.buy()
with open("details.txt", "r") as f:
    g=f.readlines()
    for i in range(len(g)):
        print(g[i])