import java.util.*;
class Duplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,temp,k=0;
        System.out.print("Enter array size:");
        n=sc.nextInt();int a[]=new int[n];
        System.out.println("Enter elements:");
        L:for(i=0;i<n;i++){
            temp=sc.nextInt();
            if(i!=0){
                for(j=0;j<k;j++)
                if(temp==a[j])
                continue L;
            }
            a[k++]=temp;
        }
        for(i=0;i<k;i++)
        System.out.print(a[i]+" ");
        for(i=0;i<n-k;i++)
        System.out.print("-1 ");
    }
}
