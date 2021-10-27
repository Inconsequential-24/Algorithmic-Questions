#include<stdio.h>
#include<conio.h>

int array_check(int a[],int n)
{
    int max,i;
    max = a[0];
    for(i=1; i<n; i++){
        if(max<a[i])
        max=a[i];         
    }
    printf("Maximum of the array is : %d", max);
}
int main()
{
    int a[100],i,n;

    printf ("Enter size of the array: ");
    scanf("%d",&n);

    printf("Enter elements in array: ");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }
    array_check(a,n);
}
