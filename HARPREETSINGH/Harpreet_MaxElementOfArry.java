import java.io.*;
public class Harpreet_MaxElementOfArray
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        int a[]=new int [10];   
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(d.readLine());
        }
        System.out.print("Input : ");
        for(int i=0;i<10;i++)
        {
            System.out.print( a[i]+" ");
        }
        System.out.println();
        int max=a[0];
          for(int i=0;i<10;i++)
          {
             if(max<a[i])
                 max=a[i];
           }
               
              System.out.print("Output :"+max);
          }
    }
