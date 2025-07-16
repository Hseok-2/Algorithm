import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();

        // set에 서로 다른 두 개의 인덱스를 더한 모든 수 담기 (중복은 저장안함 => HashSet)
        for (int i=0; i < numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }

        // stream 변환 -> Integer를 int로 변환 -> 오름차순 -> int[] 변환
        return answer.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }
}