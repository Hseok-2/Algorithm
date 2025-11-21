import java.util.*;
class Solution {
    public String solution(String number, int k) {
        int len = number.length() - k; // 만들어야할 최종 문자열 길이
        int idx = 0; // 다음 숫자를 찾기 시작할 위치 (인덱스)
        StringBuilder answer = new StringBuilder(); // 문자열

        for (int i = 0; i < len; i++) {
            char max = '0';
            for (int j = idx; j <= k + i; j++) {
                if (number.charAt(j) > max) {
                    max = number.charAt(j);
                    idx = j + 1; // 다음 숫자로 이동 (중복 x)
                }
                if(max == '9') break;
            }
            answer.append(max);
        }

        return answer.toString();
    }
}