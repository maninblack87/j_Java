package DesignPattern.Builder;

class Person {
    private final String name;
    private final int age;
    private final String gender;
    private final String address;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
    }

    public static class Builder {
        private final String name;
        private final int age;
        private String gender;
        private String address;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 최종적으로 생성된 Person객체를 반환
        public Person build() {
            return new Person(this);
        }
    }

    // Person 객체의 getter 메서드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

}

    

public class Builder01 {

    public static void main(String[] args) {
        // 빌더 패턴을 사용하여 Person 객체 생성
        Person person = new Person.Builder("John", 30)
                            .gender("Male")
                            .address("123 Main st, City")
                            .build();

        // 생성된 Person 객체의 정보 출력
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("gender: " + person.getGender());
        System.out.println("address: " + person.getAddress());
    }

}
