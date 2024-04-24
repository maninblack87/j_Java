package Study;

public class Quiz2 {
    public static void main(String[] args){
        int[][] arr = new int[3][3];
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                arr[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(arr[i][j] + ' ');
            }
            System.out.println();
        }
    }
}
