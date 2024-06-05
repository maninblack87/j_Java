package Study.Inheritance2;

import java.util.ArrayList;

public class AnimalManagement {

    // 변수 선언
    private ArrayList<Animal> animals;

    // 생성자
    public AnimalManagement(){
        animals = new ArrayList<>();
    }

    // 동물 등록
    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    // 동물 탈퇴
    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    // 모든 동물의 정보 열람
    public void displayAnimals(){
        System.out.println("---------- 모든 동물의 정보 -----------\n");
        for (Animal animal : animals){
            animal.displayInfo();
        }
        System.out.println("--------------------------------------");
    }

    // 동물이 내는 소리를 출력
    public void printMakeSound(Animal animal){
        System.out.println("음성: " + animal.makesound());
    }

    // 동물이 먹이를 먹는 행동을 출력
    public void printEat(Animal animal){
        System.out.println("식사: " + animal.eat());
    }

    public static void main(String[] args){

        // 동물 관리 시스템 객체 생성
        AnimalManagement amsys = new AnimalManagement();

        // 동물 객체 생성
        Animal dog1 = new Dog("Charlie", 10, 10, "Shih Tzu");
        Animal cat1 = new Cat("Elizabeth", 9, 12, "Golden");
        Animal Bear1 = new Bear("Podolski", 10, 200, "Brown");
        Animal Bird1 = new Bird("Billy", 5, 10, 20);
        Animal dog2 = new Dog("Jimmy", 1, 20, "Golden Retriever");

        // 동물 관리 시스템에 동물 객체를 등록
        amsys.addAnimal(dog1);
        amsys.addAnimal(cat1);
        amsys.addAnimal(Bear1);
        amsys.addAnimal(Bird1);
        amsys.addAnimal(dog2);

        // 동물 관리 시스템에 등록된 모든 동물들의 정보를 열람
        amsys.displayAnimals();

        // 동물 관리 시트템에 등록된 모든 동물들의 소리와 식사 행동을 출력
        for (int i = 0; i < amsys.animals.size(); i++){
            System.out.printf("%s\n", amsys.animals.get(i).getName());
            amsys.printMakeSound(amsys.animals.get(i));
            amsys.printEat(amsys.animals.get(i));
            System.out.println();
        }

        // 동물 관리 시스템에서 동물 객체를 탈퇴 처리
        amsys.removeAnimal(dog2);

        // 탈퇴 처리 후 동물 관리 시스템에 등록된 동물 현황을 체크
        System.out.println("동물 탈퇴 처리 후 동물 현황\n");
        for (int i = 0; i < amsys.animals.size(); i++){
            System.out.printf("%s\n", amsys.animals.get(i).getName());
            amsys.printMakeSound(amsys.animals.get(i));
            amsys.printEat(amsys.animals.get(i));
            System.out.println();
        }

    }

}
