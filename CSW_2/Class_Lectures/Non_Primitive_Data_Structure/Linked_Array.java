/* Take a 2 Dimentional array and print it in hellical way in java. */

package Class_Lectures.Non_Primitive_Data_Structure;

public class Linked_Array {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{11, 12, 13}};
        int rows = array.length;
        int columns = array[0].length;
        int m[]=new int[rows*columns];
        int k=0;
        for(int i=0; i<rows; i++){
            if(i%2==0){
                for(int j=0; j<columns; j++){
                    m[k]=array[i][j];
                    k++;
                }
            }
            else{
                for(int j=columns-1; j>=0; j--){
                    m[k]=array[i][j];
                    k++;
                }
            }
        }
        for(int j=0; j<rows*columns; j++){
            System.out.print(m[j]+" ");
        }
    }
}
        