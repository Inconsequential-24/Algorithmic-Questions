import java.util.*;
class Q3_Intermediate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array and the target value: ");
        int n=sc.nextInt();
        int target=sc.nextInt();
        int nums[]=new int[n];
        //filling the array
        System.out.print("Enter the elements,please:)");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        int targetindex[]=new int[n];
        int p=0,q=0,r=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++)
        {
            p=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                q=nums[j];
                if(p+q==target)
                {
                    targetindex[r]=i;
                    targetindex[r+1]=j;
                    r=r+2;
                    flag=true;
                }
            }
        }
        //printing
        if(flag==true)//if two elements were found that add upto the target value
        {
            System.out.print("[");
            for(int i=0;i<2;i++)
            {
                System.out.print(targetindex[i]+" ");
            }
            System.out.print("]");
        }
        else//no two element add upto the target value
        System.out.println("No Element Found");
    }
}