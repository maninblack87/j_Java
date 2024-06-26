package Study.CharacterManagementSystem;

public class Character {

    private String name;
    private int level;
    private int experience;
    private int healthPoints;
    private int magicPoints;

    public Character(String name){
        this.name         = name;
        this.level        = 1;
        this.experience   = 0;
        this.healthPoints = 1;
        this.magicPoints  = 1;
    }

    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public int getExperience(){
        return experience;
    }
    public int getHeathPoints(){
        return healthPoints;
    }
    public int getMagicPoints(){
        return magicPoints;
    }

    public void gainExperience(int exp){
        experience += exp;
        System.out.println(name + "이 " + exp + "만큼 경험치를 얻었습니다");
    }

    public void takeDamage(int dmg){
        healthPoints -= dmg;
        System.out.println(name + "이 " + dmg + "만큼 데미지를 입었습니다");
    }

    public void castSpell(String spellName){
        System.out.println(name + "이 " + spellName + "을 시전하였습니다");
    }

    public void levelUp(){
        level++;
        System.out.println(name + "의 레벨이 증가했습니다\n레벨 " + level);
    }

    public void displayState(){
        System.out.println("----------------< 캐릭터 정보 >----------------\n");
        System.out.println("이름   : " + getName());
        System.out.println("레벨   : " + getLevel());
        System.out.println("경험치 : " + getExperience());
        System.out.println("체력   : " + getHeathPoints());
        System.out.println("마력   : " + getMagicPoints());
    }
    
}
