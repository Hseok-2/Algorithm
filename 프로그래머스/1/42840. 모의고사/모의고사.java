import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        // 수포자 답안 저장
        int[][] applicant = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };
        
        // 각 수포자 정답 수
        int[] score = new int[applicant.length];
        
        for(int i=0; i<answers.length; i++) {
            for(int j=0; j<applicant.length; j++) {
                if(answers[i] == applicant[j][i % applicant[j].length]) {
                    score[j]++;
                }
            }
        }
        
        // 가장 많은 문제 맞힌 수
        int maxScore = score[0];
        for(int i=1; i<score.length; i++) {
            if(score[i] > maxScore) {
                maxScore = score[i];
            }
        }
        
        // 여려명일 경우, 정렬 사용을 위해 ArrayList 선언
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<score.length; i++) {
            if(score[i] == maxScore) {
                list.add(i+1);
            }
        }
        
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}