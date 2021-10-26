##python program to print a pattern
r=int(input("No of rows\n"))
for i in range(0,r):
    for j in range (0,i+1):
        print("*", end="")
    print()
