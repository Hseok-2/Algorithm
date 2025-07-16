import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new TreeSet<>();

        // set에 서로 다른 두 개의 인덱스를 더한 모든 수 담기 (중복은 저장안함 => TreeSet)
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                int result = numbers[i] + numbers[j];
                answer.add(result);
            }
        }

        // set 오름차순 후 배열로 변환 후 출력
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}