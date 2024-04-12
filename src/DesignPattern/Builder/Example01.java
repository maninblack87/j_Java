package DesignPattern.Builder;

// Person 클래스
class Person {
    private final String name;
    private final int age;
    private final String gender;
    private final String address;

    // Person 생성자를 private으로 선언하여 외부에서 직접 생성하지 못하도록 합니다.
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
    }

    // Person 객체를 생성하는 Builder 클래스
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

// 메인 클래스
public class Example01 {
    public static void main(String[] args) {
        // 빌더 패턴을 사용하여 Person 객체 생성
        Person person = new Person.Builder("John", 30)
                            .gender("Male")
                            .address("123 Main St, City")
                            .build();

        // 생성된 Person 객체의 정보 출력
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Address: " + person.getAddress());
    }
}