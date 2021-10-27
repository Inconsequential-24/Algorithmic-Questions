""" Write a program to print the following pattern:
        *
       **
      ***
     ****
    ***** 
"""


for a in range(5):
    print(" "*(4-a),end="")
    for b in range(0,a+1):
        print("*",end="")
    print( )
