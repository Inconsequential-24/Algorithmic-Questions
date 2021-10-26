import java.io.*;
public class Harpreet_intermediate1
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        int a[]=new int [10];   
        int sort[] =new int[10];
        int v=0;
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(d.readLine());
        }
        System.out.println("Enter the kth maximum number");
        int  k=Integer.parseInt(d.readLine());
        System.out.print("Input : arr is [");
        for(int i=0;i<10;i++)
        {
            System.out.print( a[i]+" ");
        }
        System.out.print("]");

          for(int i=0;i<10;i++)
          {
              int z=a[i];
            for(int j=i;j<10;j++)
            {
             if(z>a[j])
                 z=a[j];
            }
             sort[v++]=z;
           }
               
              System.out.print("OUTPUT"+a[10-k]);
          }
    }