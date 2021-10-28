#include<stdio.h>
#include<conio.h>

void main() 
{
    int i,j,n;
    printf("enter number of rows");
    scanf("%d", &n);
    for (i = n-1; i >= 1; i--) 
	{
        for (j = 1; j <= i; j++)
	  {
            printf("*");
          }
        printf("\n");
        }
}
