/*   String_Splitting.  */

public class String_Splitting {
    public static void main(String[] args) {
        String my_str="ITER :A SOA University";
        String delimiter=":";
        String [] splits=my_str.split(delimiter);
        for(String a : splits){
            System.out.println(a);
        }
    }
}

/* 
OUTPUT

ITER 
A SOA University

*/