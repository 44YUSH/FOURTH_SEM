package Class_Lectures;

interface callVolume{
    int volResult(int length, int breadth, int height);
}
class Boxz implements callVolume{
    public int volResult(int length, int breadth, int height){
        return length * breadth * height;
    } 
}

public class spring2 {
    public static void main(String[] args) {
        callVolume callVol = new Boxz();
        int volume = callVol.volResult(5, 3, 2);
        System.out.println(volume);
    }
}
