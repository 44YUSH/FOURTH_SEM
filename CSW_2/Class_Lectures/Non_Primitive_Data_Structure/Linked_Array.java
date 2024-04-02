/* Take a 2 Dimentional array and print it in hellical way in java. */

package Class_Lectures.Non_Primitive_Data_Structure;

public class Linked_Array {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int rows = array.length;
        int columns = array[0].length;
        int index = 0;
        int currentRow = 0;
        int currentColumn = 0;
        boolean goingDown = true;

        while (index < rows * columns) {
            if (currentRow == -1) {
                currentRow = 0;
                currentColumn++;
                goingDown =!goingDown;
            }
            if (currentColumn == columns) {
                currentColumn = columns - 1;
                currentRow++;
                goingDown =!goingDown;
            }
            System.out.print(array[currentRow][currentColumn] + " ");
            index++;
            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }
    }
}

/*
OUTPUT

1 4 7 10 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4.
 */