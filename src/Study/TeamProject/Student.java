package Study.TeamProject;

public class Student {
    private String  name;
    private Boolean isPaid;

    public Student(String name){
        this.name   = name;
        this.isPaid = false;
    }

    public String getName(){
        return name;
    }

    public String getIsPaid(){
        String result = "미지불";
        if (isPaid == true){
            result = "지불완료";
        }
        return result;
    }
}
