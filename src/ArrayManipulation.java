import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        int m=sc.nextInt();

        int a,b,k;
        int[] arr=new int[n];
        for(int j=0;j<m;j++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            k=sc.nextInt();

        }
        for(int i=0;i<n+1;i++)
        {
            arr[i]=0;
        }

        System.out.println(arr);
    }
}
