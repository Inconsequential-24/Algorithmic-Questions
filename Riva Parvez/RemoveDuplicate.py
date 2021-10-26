# python program to remove duplicate elements from a list
lst=[]
n=int(input("enter number of elements in list\n"))
for i in range(0,n):
    ele=int(input("enter element\n"))
    lst.append(ele)
print(sorted(lst))

def operation(a):
    lst2=[]
    for num in a:
        if num not in lst2:
            lst2.append(num)
    return lst2
final_lst=operation(lst)
print(sorted(final_lst))
