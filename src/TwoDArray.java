import java.util.*;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("rows: "+rows + "cols: "+cols);

        int[][] numbers = new int[rows][cols];

        //input
        //Rows
        for (int i=0; i<rows; i++) {
            //System.out.println("Iteration in rows: "+i);
            //Columns
            for (int j=0; j<cols; j++) {
               // System.out.println("Please enter number");
               // System.out.println("Iteration in columns: "+j);
                numbers[i][j] = sc.nextInt();
            }
            System.out.println("Created number array until now: "+Arrays.deepToString(numbers));
        }

        //output
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
