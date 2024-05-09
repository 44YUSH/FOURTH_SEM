package Class_Lectures;
import java.util.Arrays;
import java.util.Random;
public class Matrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3,3)));
    }
    public static int [][] generateMatrix(int rows, int columns){
        int [][] matrix = new int[rows][columns];
        Random random = new Random();
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j]=random.nextInt() / 1000;
            }
        }
        return matrix;
    }
}

/*
OUTPUT

[[-38552, 1821273, -1704749], [-1641142, 802140, -576983], [-49849, 753293, 1161832]]
 */