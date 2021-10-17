#include<stdio.h>
#include<conio.h>

float main()
{
float bs,ta,da,hra,gs;
clrscr();
printf("\n Enter Basic Salary");
scanf("%f",&bs);
ta=0.12*bs;
da=0.10*bs;
hra=0.10*bs;
gs=bs+ta+da+hra;
printf("\n Gross Salary is: %f",&gs);
getch();
return 0;
}