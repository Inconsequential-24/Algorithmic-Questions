import java.util.*;
class Q4
 {
     static void change(int arr[], int n)
    {
        int j = 0, t;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] < 0)
            {
                if (i != j)
                {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
                j++;
            }
        }
    }
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF Elemenets MATRIX and then the elements of the matrix:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        change(arr, n);
        print(arr, n);
    }
}