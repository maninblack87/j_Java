package Study.PokemonSimulation;

import java.util.ArrayList;

public class Pokemon {
    private String name;
    private int level;
    private int experience;
    private int healthPoints;
    private String type;
    private ArrayList<String> moves;

    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
        level = 1;
        experience = 0;
        healthPoints = 5;

        moves.add("몸통박치기");
    }

    // get함수
    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public int getExperience(){
        return experience;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
    public String getType(){
        return type;
    }
    public ArrayList<String> getMoves(){
        return moves;
    }
    
    // 포켓몬에게 경험치를 추가
    public void gainExperience(int exp){
        experience += exp;
    }

    // 포켓몬이 다른 포켓몬에게 공격하는 메소드
    public void attack(Pokemon target, String moveName){
        target.takeDamage(1);
        System.out.println(getName() + "이 " + target.getName() + "을 공격해서 " + 1 + "의 데미지를 주었다");

        // 공격후 자신과 상대의 포켓몬의 상태를 표시한다
        displayState();
        target.displayState();

    }

    // 포켓몬이 데미지를 받는 메소드
    public void takeDamage(int dmg){
        int currentMyPokemonHP = getHealthPoints();

        currentMyPokemonHP -= dmg;

    }

    // 포켓몬의 상태 표시
    public void displayState(){
        System.out.println("-------------< 포켓몬 정보>-------------");
        System.out.println("이름 : " + getName());
        System.out.println("레벨 : " + getLevel());
        System.out.println("체력 : " + getHealthPoints());
    }
}

