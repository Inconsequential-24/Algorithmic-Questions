import java.util.*;
class arrr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;//for storing number of elements in tthe array
        System.out.println("PLEASE ENTER THE NUMBER OF ELEMENTS OF THE ARRAY:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values in the array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("MAXIMUM IS ="+max);
    }
}