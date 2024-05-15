package Class_Lectures;

public class spring1 {
    public static void main(String[] args) {
        Box b=new Box(5, 3, 2);
        System.out.println(b.volume);
    }
}
class Box{
    public int volume;
    Box(int l, int b, int h){
        this.volume=l*b*h;
    }
}
