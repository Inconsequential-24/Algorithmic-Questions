#include <stdio.h>
void main()
{
        int i,j,k=5;
        for(i=0;i<5;i++)
        {
            for(int q=0;q<k-i-1;q++)
            {
             printf(" ");
            }
            for(j=k-i-1;j<5;j++)
            {
                printf("*");
            }
             printf("\n");
        }
    
}