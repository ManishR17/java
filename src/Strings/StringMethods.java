package Strings;

public class StringMethods {
    public static void main(String[] args)
    {

        //creating using literals
        String str="manish";
        String str1=" reddy";
        if(str.equals(str1))
            System.out.println("equals");
        else
            System.out.println("not equals");
        //CompareTo()
        if(str.compareTo(str1)==0)
            System.out.println("equals");
        else
            System.out.println("not equals");
        //length()
        System.out.println("length of:"+str1.length());
        //charAt()
        System.out.println("char at:"+str.charAt(5));
        //concat()
        String str2=str.concat(str1);
        System.out.println("concat str and str1:"+str2);
        //toUpperCase
        System.out.println("upper case:"+str2.toUpperCase());
        //replace()
        System.out.println("replace:"+str.replace("m","M"));
        //trim()
        System.out.println("trim:"+str2.trim());
        //contains()
        System.out.println("contains: "+str2.contains("r"));
        //endsWith()
        System.out.println("ends With"+str2.endsWith("reddy"));
        //isEmpty()
        System.out.println("is empty:"+str2.isEmpty());
        System.out.println("is blank:"+str2.isBlank());
        //creating string with object
        String str3=new String("candy");
        System.out.println("object creation:"+str3);
        //toChar()
        char[] chh=str3.toCharArray();
        for(char ch=0;ch<str3.length();ch++) {
            System.out.print(chh[ch]+" ");
        }
        System.out.println();
        //String Buffer
        StringBuffer sb=new StringBuffer("manish");
        sb.append(" reddy");
        System.out.println("buffer:"+sb);
        //String Builder
        StringBuilder stb = new StringBuilder("Reddy ");
        stb.append("Manish");
        System.out.println("builder:"+stb);
    }
}
