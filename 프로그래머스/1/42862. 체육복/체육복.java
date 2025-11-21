import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    n++;
                }
            }
        }
        int answer = n - lost.length; // 수업을 참여할 수 있는 최대 학생 수

        for (int i = 0; i < lost.length; i++) {
            if(lost[i] == -1) continue;
            for (int j = 0; j < reserve.length; j++) {
                if(reserve[j] == -1) continue;
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}