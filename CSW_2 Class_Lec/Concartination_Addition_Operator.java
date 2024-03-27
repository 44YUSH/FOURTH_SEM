/* CONCARTINATION using ADDITION OPERATOR. */

public class Concartination_Addition_Operator{
    public static void main(String[] args) {

        /* i. Concartination of Two Strings. */

        String s1, s2, s3; 
        s1="Hello";
        s2=" Section 44";
        s3=s1+s2;
        System.out.println(s3);

        System.out.println("*****************");

        /* ii. Concartination of VARIABLE OBJECTS. */

        String a1, a2, a4;
        int a3;
        a1="Hello";
        a2=" Section ";
        a3=44;
        a4=a1+a2+a3;
        System.out.println(a4);
    }
}

/*OUTPUT

Hello Section 44
*****************
Hello Section 44
 */