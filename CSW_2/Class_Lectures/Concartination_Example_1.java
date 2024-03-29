package Class_Lectures;
public class Concartination_Example_1 {
    public static void main(String[] args) {
        String s1, s2, s3;
        s1="Hello";
        s2="";
        s3=s1.concat(s2);
        System.out.println("Case 1 -- Concat");
        if(s1==s3){
            System.out.println("Both are same.");
        }
        else{
            System.out.println("Not same.");
        }
        System.out.println();
        System.out.println("Case 2 -- '+'");
        String s4=s1+s2;
        if(s1==s4){
            System.out.println("Both are same.");
        }
        else{
            System.out.println("Not same");
        }
    }
}

/*
OUTPUT

Case 1 -- Concat
Both are same.

Case 2 -- '+'
Not same
*/