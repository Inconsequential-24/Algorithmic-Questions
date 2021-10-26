import java.io.*;
public class Harpreet_pallindrome
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        String a,b="";
        int i,j,l;
        System.out.print("Input:");
        a=d.readLine();
        l=a.length();
        System.out.println(a);
        for(i=l-1;i>=0;i--)
        {
            b+=a.charAt(i);
        }
        if(b.equals(a))
        {
            System.out.println("Output: String is palindrome");
        }
        else
        System.out.println("Output: String is not palindrome");
}
}