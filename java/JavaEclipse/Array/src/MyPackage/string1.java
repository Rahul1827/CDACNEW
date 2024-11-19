package MyPackage;

public class string1 {

    public static void main(String[] args) {
       
        String s2 = "PG DAC";
        String s1 = "Have A Nice Day";

       
        String s3 = s1;  
       
        System.out.println("Length of string is = " + s1.length());
        System.out.println("6th position is = " + s1.charAt(6));
        System.out.println("Upper Case of string is = " + s1.toUpperCase());
        System.out.println("Lower Case of string is = " + s1.toLowerCase());
        System.out.println("Concat String is = " + s1.concat(s2));
        System.out.println("Copied String (s3) is = " + s3);  
 
    }
}
