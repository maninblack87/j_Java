package Study.Samples;

import java.util.*;

public class WordLengthGrouping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 단어들을 입력받아 리스트에 저장합니다.
        List<String> words = new ArrayList<>();
        System.out.println("단어를 입력하세요 (끝내려면 '끝'을 입력하세요):");
        String input;
        while (!(input = scanner.next()).equals("끝")) {
            words.add(input);
        }

        // 각 단어의 길이를 계산하여 길이별로 그룹화합니다.
        Map<Integer, List<String>> wordLengthMap = groupWordsByLength(words);

        // 그룹화된 결과를 출력합니다.
        for (Map.Entry<Integer, List<String>> entry : wordLengthMap.entrySet()) {
            System.out.println(entry.getKey() + "글자 단어들: " + entry.getValue());
        }

        // 스캐너를 닫습니다.
        scanner.close();
    }

    // 단어 리스트를 받아서 단어의 길이별로 그룹화하는 메서드
    public static Map<Integer, List<String>> groupWordsByLength(List<String> words) {
        Map<Integer, List<String>> wordLengthMap = new HashMap<>();
        for (String word : words) {
            int length = word.length();
            if (!wordLengthMap.containsKey(length)) {
                wordLengthMap.put(length, new ArrayList<>());
            }
            wordLengthMap.get(length).add(word);
        }
        return wordLengthMap;
    }
}