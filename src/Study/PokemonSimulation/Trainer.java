package Study.PokemonSimulation;

import java.util.ArrayList;
import java.util.Random;

public class Trainer {
    private String trainerName;
    private ArrayList<Pokemon> pokemons;

    public Trainer(String trainerName){
        this.trainerName = trainerName;
    }

    // get함수
    public String getTrainerName(){
        return trainerName;
    }
    public ArrayList<Pokemon> getPokemons(){
        return pokemons;
    }

    // 트레이너가 포켓몬을 교체하는 메소드
    // 참고 : pokemons의 0번째 인덱스의 pokemon은 mainPokemon으로 즉시 전투에 참여할 pokemon이다
    public void switchPokemon(int index){
        Pokemon mainPokemon = pokemons.get(0);
        Pokemon selectedPokemon = pokemons.get(index);
        Pokemon tmp;
        
        // pokemon 스와핑
        tmp = mainPokemon;
        mainPokemon = selectedPokemon;
        selectedPokemon = tmp;

        // 교체 결과 출력
        System.out.println(mainPokemon.getName() + "이 들어가고 " + selectedPokemon.getName() + "이 출동한다");
    }

    // 트레이너가 아이템(포켓볼)을 사용한다
    // (현재 아이템이 포켓볼 밖에 없고 트레이너는 무한한 포켓볼을 가지고 있다)
    // (일단 포켓볼을 타깃 포켓몬에게 사용하면 2분의 1의 확률로 성공한다)
    public void usePokeball(String item, Pokemon target){
        Random rand = new Random();
        int num = rand.nextInt(2);

        if (num == 1){                      // 포획 성공!
            addPokemon(target);
            System.out.println(getTrainerName() + "이 " + target.getName() + "을 포획 성공했다!");
        } else {                            // 포획 실패
            System.out.println(getTrainerName() + "이 " + target.getName() + "을 포획 실패했다......");
        }

    }

    // pokemons에 Pokemon을 추가하는 함수(여러 포켓몬 추가 가능)
    public void addPokemon(Pokemon... pokemons){
        for (Pokemon pokemon : pokemons){
            addPokemon(pokemon);
        }
    }

    // pokemons에서 Pokemon이 전투불능이 되어 삭제되는 함수
    // 전투중인 포켓몬은 0번째 인덱스의 포켓몬이기 때문에 0번째만 삭제되는 함수이다
    public void outPokemon(){
        pokemons.remove(0);
    }

}
