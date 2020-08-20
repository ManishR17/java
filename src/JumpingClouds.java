import java.util.Scanner;

public class JumpingClouds {
    static int jump(int[] arr)
    {
        int count=-1;
        for(int i=0;i<arr.length;i++,count++)
        {

            if(i+2<arr.length&&arr[i+2]==0)
            {
                i++;
            }

        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       int ans=jump(arr);
        System.out.println(ans);

    }
}
