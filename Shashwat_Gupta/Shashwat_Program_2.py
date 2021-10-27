#Question: Write a program to input an array of integers and output the maximum element of the array.
#This question's solution is in Python Programming Language
print("Enter the array below and make sure you enter it in a format similar to this: 1 2 3 4 5 ")
arr = input("Enter the array: ")
try:
    lst = []
    for i in arr.split(" "):
        lst.append(int(i))
    print("Max of the numbers entered is ", max(lst))
except:
    print("An error occured!!!\nMaybe you entered the array in a wrong format." 
