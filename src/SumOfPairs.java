import java.util.Arrays;
import java.util.Scanner;

public class SumOfPairs {
    public static void sum(int[] arr,int p1,int p2,int sum)
    {
        while(p1<p2)
        {

            if(arr[p1]+arr[p2]<sum)
                p1++;
             if(arr[p1]+arr[p2]>sum)
                p2--;
             if(arr[p1]+arr[p2]==sum){
                System.out.println(arr[p1]+" "+arr[p2]);}
            p1++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("sum:");
        int sum=sc.nextInt();
        System.out.println("size of array:");
        int n=sc.nextInt();
        int p1=0;int p2=n-1;
        int[] arr=new int[n];
        System.out.println("array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
       sum(arr,0,n-1,sum);
    }
}
