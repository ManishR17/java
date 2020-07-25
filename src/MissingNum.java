public class MissingNum {
    public static void main(String[] args) {

        int arr[] = {5, 8, 7, 6, 10};
        int arr1[] = {5, 7, 6, 8};
        int sum = 0;
        int arraysum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arraysum += arr1[i];
        }
        System.out.println(sum - arraysum);

    }
}