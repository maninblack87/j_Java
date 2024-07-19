package Study;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class RandomExample {
    public static void main(String[] args) {
        // ArrayList를 생성하면서 초기 멤버들을 정의합니다.
        ArrayList<String> team = new ArrayList<>(List.of("전석환", "윤상배", "함영도"));

        // 랜덤으로 팀원을 선택하기 위해 Random 객체를 생성합니다.
        Random random = new Random();
        
        // ArrayList의 크기 내에서 랜덤 인덱스를 생성합니다.
        int randomIndex = random.nextInt(team.size());
        
        // 선택된 팀원을 출력합니다.
        String randomMember = team.get(randomIndex);
        System.out.println("선택된 팀원: " + randomMember);
    }
}