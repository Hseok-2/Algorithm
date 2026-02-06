import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> usedWords = new HashSet<>();

        usedWords.add(words[0]);
        for (int i = 1; i < words.length; i++) {

            char prevLastChar = words[i-1].charAt(words[i-1].length()-1);
            char curFirstChar = words[i].charAt(0);

            // 앞 사람이 말한 단어의 마지막 문자로 시작하는지 확인 or 중복된 단어인지 확인
            if(prevLastChar != curFirstChar || usedWords.contains(words[i])) {
                int no = (i%n) + 1; // 번호
                int st = (i/n) + 1; // 차례
                return new int[]{no, st};
            }

            usedWords.add(words[i]);
        }
        return new int[]{0, 0};
    }
}