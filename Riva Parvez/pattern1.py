##python program to print a pattern
n=int(input("No of rows\n"))
for i in range(0,n):
    for j in range (0,i+1):
        print("*", end="")
    print()
