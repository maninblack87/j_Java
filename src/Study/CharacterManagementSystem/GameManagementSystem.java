package Study.CharacterManagementSystem;

import Study._MyComponents.RandomGenerator;

import java.util.ArrayList;

public class GameManagementSystem {
    public static void main(String[] args) {

        // 생성된 플레이어들을 담을 배열 mainServer를 생성한다.
        ArrayList<Player> mainServer = new ArrayList<>();

        Player p1 = new Player("p1", "플레이어1", new Character("캐릭터1"));
        Player p2 = new Player("p2", "플레이어2", new Character("캐릭터2"));
        Player p3 = new Player("p3", "플레이어3", new Character("캐릭터3"));
        Player p4 = new Player("p4", "플레이어1", new Character("캐릭터4"));
        Player p5 = new Player("p5", "플레이어1", new Character("캐릭터5"));

        // 생성된 플레이어들을 mainServer에 담는다
        mainServer.add(p1);
        mainServer.add(p2);
        mainServer.add(p3);
        mainServer.add(p4);
        mainServer.add(p5);





        // (mainServer에 담겨진) 모든 플레이어들의 정보를 표시한다
        System.out.println("------------------<< 모든 플레이어의 정보를 표시 >>------------------\n");

        for (int i = 0; i < mainServer.size(); i++){
            mainServer.get(i).getCharacter().displayState();
        }

        System.out.println();

        // 첫 번째 공격 : 플레이어는 자기 바로 다음 플레이어를 공격한다
        System.out.println("------------------<< 첫 번째 공격 시작 >>------------------\n");

        for (int i = 0; i < mainServer.size(); i++){

            // 일단 공격 대상을 공격자보다 바로 다음에 생성된 플레이어로 지정한다
            int attackedPlayerIdx = i + 1;
            if (i >= mainServer.size()-1){
                attackedPlayerIdx = 0;
            }

            // 공격을 수행하는 함수를 호출한다
            mainServer.get(i).attack(mainServer.get(attackedPlayerIdx).getCharacter());

        }

        System.out.println("");
        System.out.println("------------------<< 첫 번째 공격 종료 >>------------------\n\n\n");







        // 두 번째 공격 : 플레이어는 자기 자신 제외 랜덤하게 공격한다
        System.out.println("------------------<< 두 번째 공격 시작 >>------------------\n");

        RandomGenerator randGen = new RandomGenerator();

        for (int i = 0; i < mainServer.size(); i++){
            int randomIdx = randGen.randNumGenerate(mainServer.size());
            String charName = mainServer.get(i).getCharacter().getName();

            if (randomIdx == i){
                System.out.println(charName + "은 공격을 실패했다.");
            } else {
                mainServer.get(i).attack(mainServer.get(randomIdx).getCharacter());
            }

        }

        System.out.println();
        System.out.println("------------------<< 두 번째 공격 종료 >>------------------\n\n\n");

    }
}
