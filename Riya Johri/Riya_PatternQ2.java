import java.util.*;
class Pattern2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,p=1,n=4,sp;
for(i=1;i<=5;i++)
{
for(sp=1;sp<=n;sp++)
{
System.out.print(" ");
}
for(j=1;j<=p;j++)
{
System.out.print("*");
}
System.out.println();
n--;
p++;
}
}
}
