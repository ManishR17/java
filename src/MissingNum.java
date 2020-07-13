public class MissingNum {
    public static void main(String[] args)
    {

        int arr[]={1,2,3,4,5,6};
        int arr1[]={1,2,3,5,6};
        int n=arr.length;
        int sum=(n*(n+1))/2;
        int arraysum=0;
        for(int i=0;i<n-1;i++)
        {
            arraysum+=arr1[i];
        }
        System.out.println(sum-arraysum);
    }

}
