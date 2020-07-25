import java.util.Arrays;

public class RemoveDuplicates {
    public static int remove(char[] arr,int n)
    {
        if(n==0||n==1)
            return n;
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        return j;
    }
    public static void main(String[] args)
    {
        char[] arr ={'a','b','a','b'};
        Arrays.sort(arr);
        int n=arr.length;
        n=remove(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
/**
*****Find duplicates****
 * int[] arr={2,5,8,9,2,5,8};
 * HashSet<Integer> hs=new HashSet<>();
 * for(int i:arr)
 * {
 *     if(!hs.add(i))
 *     {
 *         System.out.println(i);
 *     }
 *
 * }
  */
