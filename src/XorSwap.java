public class XorSwap {
    public static void main(String[] args)
    {
        int n1=10,n2=20;
        System.out.println("before swapping:"+n1+" "+n2);
        //n1=n1^n2;
        //n2=n1^n2;
        n2^=(n1^=n2);
        n1=n1^n2;
        System.out.println("after swapping:"+n1+" "+n2);
    }
}
