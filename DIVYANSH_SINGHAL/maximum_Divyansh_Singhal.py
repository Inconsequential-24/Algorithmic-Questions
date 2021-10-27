""" Program to input an array of integers and output the maximum element of the array"

n=eval(input("Enter the array:"))
l=()
for a in n:
    if a==" ":
        continue
    else:
        l+=(int(a),)
print("The maximum element of the array is:",max(l))
    
