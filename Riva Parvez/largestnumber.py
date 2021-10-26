##python program to find the largest element in an array
lst=[]
n= int(input("enter number of elements in array\n"))
for i in range(0,n):
    e=int(input("enter element\n"))
    lst.append(e)
print(lst)

largest=None
for j in range(0,n):
    if largest is None:
        largest=lst[j]
    elif lst[j]>largest:
        largest=lst[j]
print("Largest value = ", largest)

