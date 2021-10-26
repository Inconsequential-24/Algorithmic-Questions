# python program to check if a string is palindrome
word =input("Enter a word\n")
def isPalindrome(data):
    for i in range(0,int(len(data)/2)):
        if data[i] != data[len(data)-i-1]:
            return False
    return True
check= isPalindrome(word)
if(check):
   print("String is palindrome")
else:
   print("String is not palindrome")
