#include<stdio.h>
void main()
{
	char str1[20];
	int i,flag=0,length=0;
	printf("Input a string:-\n");
	scanf("%s",str1);
	length = strlen(str1);
	for(i=0; i<length; i++)
	{
        if(str1[i] != str1[length-i-1])
		{
            flag = 1;
            break;
         }
    }
    if (flag) 
	{
        printf("%s is not a palindrome", str1);
    }    
    else 
	{
        printf("%s is a palindrome", str1);
    }
}
