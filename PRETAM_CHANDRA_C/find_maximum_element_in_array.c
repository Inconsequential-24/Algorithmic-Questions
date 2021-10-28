#include<stdio.h>
int main()
{
	int arr[10],size,i,max;
	printf("Input the size of the array:-\n");
	scanf("%d",&size);
	printf("\nInput the array elements:-");
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	max=arr[0];
	for(i=1;i<size;i++)
	{
		if(arr[i]>max)
		    max=arr[i];
    }
    printf("\nThe maximum element in te inputted array is:- %d",max);
}
