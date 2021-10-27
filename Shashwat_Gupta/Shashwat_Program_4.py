'''Question: Write a program to print the following pattern:
         *
        **
       ***
      ****
     *****
'''
#This solution is in Python Programming language
for i in range(5):
    print(" "*(5-i),end = '')
    for j in range(i+1):
        print("*",end = '')
    print()
