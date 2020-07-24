import java.util.Scanner;

public class SubtractionWrongAnswer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a - b;
        if (c % 10 <= 9&&c%10>1)
        {
            c = c - 1;
            System.out.print(c);
        }
        if(c%10<=1)
        {
            c = c + 1;
            System.out.print(c);
        }

    }
}
