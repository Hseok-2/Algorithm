import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌옷을 가진 학생이 도난당한 경우 처리
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    n++;
                    break;
                }
            }
        }

        int answer = n - lost.length; // 도난당하지 않은 학생 수 (수업 참여 가능)

        for (int i = 0; i < lost.length; i++) {
            if(lost[i] == -1) continue;

            for (int j = 0; j < reserve.length; j++) {
                if(reserve[j] == -1) continue;

                if (Math.abs(lost[i] - reserve[j]) == 1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}