#Write a program to input a string and check if it is a palindrome or not.
#This solution is in python programing language
str = input("Enter the string: ")
if str == str[::-1]:
    print("String is Palindrome")
else:
    print("String is not Palindrome")
