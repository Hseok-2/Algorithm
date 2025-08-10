import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer>[] lines = new Stack[board[0].length];

        // 각 열 stack 생성
        for (int i = 0; i < board.length; i++) {
            lines[i] = new Stack();
        }

        // 각 스택에 인형 쌓기
        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] > 0) {
                    lines[j].push(board[i][j]);
                }
            }
        }

        Stack<Integer> bucket = new Stack<>(); // 바구니
        int cnt = 0; // 사라진 인형의 개수

        for(int move : moves) {
            if(!lines[move-1].isEmpty()) {
                int doll = lines[move-1].pop();
                if(!bucket.isEmpty() && doll == bucket.peek()) {
                    bucket.pop();
                    cnt += 2;
                } else {
                    bucket.push(doll);
                }
            }
        }
        return cnt;
    }
}