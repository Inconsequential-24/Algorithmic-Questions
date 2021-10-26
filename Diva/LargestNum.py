##python program to find the largest element in an array
lst=[]
len= int(input("enter the length of the array\n"))
for i in range(0,len):
    element=int(input("enter element\n"))
    lst.append(element)
print(lst)

largest=None
for j in range(0,len):
    if largest is None:
        largest=lst[j]
    elif lst[j]>largest:
        largest=lst[j]
print("The largest element in the array = ", largest)
