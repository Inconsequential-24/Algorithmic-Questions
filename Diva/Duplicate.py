# python program to remove duplicate elements feom a list
lst=[]
len=int(input("Enter the length of the list\n"))
for i in range(0,len):
    element=int(input("Enter the element\n"))
    lst.append(element)
print(sorted(lst))

def operation(b):
    lst2=[]
    for number in b:
        if number not in lst2:
            lst2.append(number)
    return lst2
final_lst=operation(lst)
print(sorted(final_lst))
