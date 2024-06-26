package Study.PokemonSimulation;

public class GameManagementSystem {

    public static void main(String[] args) {
        
        // 트레이너 생성
        Trainer jiwoo = new Trainer("지우");
        Trainer t1000 = new Trainer("T1000");

        // 포켓몬 생성
        Pokemon pika = new Pokemon("피카츄", "피카츄");
        Pokemon pyri = new Pokemon("파이리", "파이리");
        Pokemon gobuk = new Pokemon("꼬부기", "꼬부기");
        Pokemon bird = new Pokemon("피존", "피존");
        Pokemon duck = new Pokemon("고라파덕", "고라파덕");

        // 트레이너에게 포켓못 증정
        jiwoo.addPokemon(pika, pyri, gobuk);
        t1000.addPokemon(bird, duck);

        Pokemon jiwooPokemon = jiwoo.getPokemons().get(0);
        Pokemon t1000Pokemon = t1000.getPokemons().get(0);

        jiwooPokemon.attack(t1000Pokemon, "몸통박치기");
        
        // 포켓몬의 체력이 0이되면 승자가 결정되며 게임 종료

    }
    
}
