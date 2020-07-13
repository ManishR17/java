import java.util.Scanner;

public class RotateArray
{
    public static void main(String args[])
    {
        int[][] arr=new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.print("rows:");
        int rows=sc.nextInt();
        System.out.print("columns:");
        int col=sc.nextInt();
        System.out.println("Array Elements:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}