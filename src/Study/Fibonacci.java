package Study;

import java.util.ArrayList;

public class Fibonacci {
    final static int NUM = 10;
    public static void main(String[] agrs){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        for (int i = 2; i < NUM; i++){
            int addNum = arr.get(i-2) + arr.get(i-1);
            arr.add(addNum);
        }
        System.out.print("결과 : ");
        for (int i = 0; i < arr.size(); i++){
            System.out.printf("%d ", arr.get(i));
        }
    }
}
