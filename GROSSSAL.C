#include<stdio.h>
#include<conio.h>
void main()
{
float bs,ds=0.0,ta=0.0,hra=0.0,gs=0.0;
printf("enter basic salary= ");
scanf("%f",&bs);
ds=0.1*bs;
ta=0.12*bs;
hra=0.1*bs;
gs=bs+ds+ta+hra;
printf("gross salary is= %f",gs);
}