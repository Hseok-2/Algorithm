import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 큐 선언
        Queue<Integer> answer = new ArrayDeque<>();
        
        // 각 기능별 배포 가능 날짜 배열로 초기화
        int n = progresses.length;
        int[] canDeploy = new int[n];

        for (int i = 0; i < n; i++) {
            canDeploy[i] = (int)(Math.ceil((100.0-progresses[i])/speeds[i]));
        }
        
        // 하나의 배포에 몇 개의 기능인지 셀 cnt 변수 선언
        int cnt = 0; 
        // 첫 번째 기능 배포일을 maxDay에 저장
        int maxDay = canDeploy[0];
        
        // for문
        for (int i = 0; i < n; i++) {
            if (canDeploy[i] <= maxDay) {
                cnt++;
            }else {
                answer.add(cnt);
                cnt = 1;
                maxDay = canDeploy[i];
            }
        }
        answer.add(cnt);

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}