 package Class_Lectures;
 public class Spiral_Matrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int s[] = new int[25];
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int p = 0;

        for (i = 0; i < 5; i++) {

            //FORWARD
            for (j = 0; j < 4; j++) {
                s[m] = arr[i][j];
                m++;
            }

            //BACKWARD
            for (k = 0; k < 4; k++) {
                s[m] = arr[k][j];
                m++;
            }

            //BACKWARD
            for (l = 4; l > 0; l--) {
                s[m] = arr[j][l];
                m++;
            }

            //UPWARD
            for (p = 4; p > 0; p--) {
                s[m] = arr[p][l];
                m++;
            }
            for(int q=0; q<=25; q++){
                System.out.print(s[q]+" ");
            }
        }
    }
}