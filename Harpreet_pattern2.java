public class pattern2
1{
    public static void main(String args[])
    {
        int i,j,k=5;
        for(i=0;i<5;i++)
        {
            for(int q=0;q<k-i-1;q++)
            {
              System.out.print(" ");
            }
            for(j=k-i-1;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}