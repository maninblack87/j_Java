package Study.CharacterManagementSystem;

public class Player {

    private String playerId;
    private String username;
    private Character character;

    public Player(String playerId, String username, Character character){
        this.playerId = playerId;
        this.username = username;
        this.character = character;
    }

    public String getPlayerId(){
        return playerId;
    }
    public String getUserName(){
        return username;
    }
    public Character getCharacter(){
        return character;
    }

    // Character의 levelUp()함수를 호출해서 레벨을 증가시키는 함수
    public void levelUp(){
        character.levelUp();
    }

    public void attack(Character otherCharacter){
        System.out.println("캐릭터 " + character.getName() + "가 " + otherCharacter.getName() + "에게 공격을 수행했다");
    }

}
