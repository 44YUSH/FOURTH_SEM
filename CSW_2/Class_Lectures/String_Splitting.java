/*   String_Splitting.  */

package Class_Lectures;
public class String_Splitting {
    public static void main(String[] args) {
        String str1="ITER :A SOA University";
        String delimiter1=":";
        String [] splits=str1.split(delimiter1);
        for(String a : splits){
            System.out.println(a);
        }
        System.out.println(".................");

        String srt2="Hello @How @Are @You";
        String delimiter2="@";
        String [] split=srt2.split(delimiter2);
        for(String b : split){
            System.out.println(b);
        }
        System.out.println(".................");

        String srt3="Hello @How @Are @You @@";
        
        String [] splitt=srt3.split("@", -2);
        for(String c : splitt){
            System.out.println(c);
        }
        System.out.println(".................");
    }
}

/* 
OUTPUT

ITER 
A SOA University
.................
Hello 
How 
Are 
You
.................
Hello 
How 
Are 
You 


.................
*/