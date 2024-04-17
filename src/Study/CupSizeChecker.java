package Study;

public abstract class CupSizeChecker {
    public static void main(String[] args) {
        System.out.println(getCupSize(50));
        System.out.println(getCupSize(150));
        System.out.println(getCupSize(250));
    }

    public static String getCupSize(int volumn){
        if (volumn < 100){
            return "small";
        } else if (volumn >= 100 && volumn < 200){
            return "medium";
        }
        else {
            return "large";
        }
    }
}
