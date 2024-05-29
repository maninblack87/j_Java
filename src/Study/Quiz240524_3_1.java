package Study;

import java.util.ArrayList;
import java.util.List;

public class Quiz240524_3_1 {
    private static int[] studentNumbers = new int[30];
    private static ArrayList<Double> values = new ArrayList<>(List.of(1.2, 3.3, 6.7));
    public static void main(String[] args){
        for (int i = 0; i < 30; i++){
            studentNumbers[i] = i + 1;
            System.out.print(studentNumbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < values.size(); i++){
            System.out.print(values.get(i) + " ");
        }
    }
}
