package Study;

import java.util.Scanner;
import java.util.ArrayList;

class NumberList{
    public ArrayList<Integer> numbers1 = new ArrayList<>();
    public ArrayList<Integer> numbers2 = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public NumberList(){
        System.out.println("___________첫 번째___________");
        addNumberList(scan, numbers1);
        System.out.println("___________두 번째___________");
        addNumberList(scan, numbers2);
    }
    private void addNumberList(Scanner scan, ArrayList<Integer> array){
        do {
            System.out.print("배열에 들어갈 숫자를 입력해주세요");
            array.add(scan.nextInt());
            System.out.print("계속 입력하시겠습니까?(y/n)");
            if(scan.next().equals("n")){
                break;
            }
        }while(true);
    }
    public void testArray(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++){
            System.out.print(array.get(i));
        }
        System.out.println();
    }
}

public class Quiz240529_1 {
    public static void main(String[] args){
        NumberList list = new NumberList();
    }
}
