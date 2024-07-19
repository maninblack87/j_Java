package Study.TeamProject;

public class Student {
    // 속성 선언
    private String  name;
    private Boolean isPaid;

    // 생성자
    public Student(String name){
        this.name   = name;
        this.isPaid = false;
    }

    // 리턴 함수1
    public String getName(){
        return name;
    }

    // 리턴 함수2
    public String getIsPaid(){
        String result = "미지불";
        if (isPaid == true){
            result = "지불완료";
        }
        return result;
    }
}
