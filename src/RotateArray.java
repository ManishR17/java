import java.util.Scanner;

public class RotateArray
{
    public void rotate(int arr[],int k)
    {
        int n=arr.length;
        k=k%n;
       reverse(arr,0,n-1);
       reverse(arr,0,k-1);
       reverse(arr,k,n-1);
       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]+" ");
       }
    }
    public void reverse(int arr[],int start,int end)
    {
        while (start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[])
    {
        RotateArray ra=new RotateArray();
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int k=4;
        ra.rotate(arr,k);

    }
}