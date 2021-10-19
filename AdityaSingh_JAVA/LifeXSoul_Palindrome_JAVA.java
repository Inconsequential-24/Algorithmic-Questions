import java.util.*;
class Q1_palindromString_JAVA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING(without special symbols at the end) TO SEE IF IT IS PALINDROME");
        String str=sc.nextLine();
        str=str.toLowerCase();
        String revstr="";
        int j=str.length()-1;
        for(int i=0;i<str.length();i++)
        {
           revstr+=str.charAt(j);
           j--;
        }
        if(str.compareTo(revstr)==0)
        {
          System.out.println("IT IS PALINDROME String");  
        }
        else
        {
          System.out.println("IT IS NOT A PALINDROME String");  
        }
    }
}