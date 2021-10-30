#include <stdio.h>  
#include <conio.h>  
void main()  
{  
      
    int i, j, k;  
    printf("\n");  
    for (i = 1; i <= 5; i++)   
    {  
        for (j = i; j < 5; j++)  
        {  
            printf(" ");   
        }  
        for (k = 1; k <= i; k++)  
        {  
            printf("*"); // print the Star  
        }  
        printf ("\n");   
    }  
    getch();      
}  