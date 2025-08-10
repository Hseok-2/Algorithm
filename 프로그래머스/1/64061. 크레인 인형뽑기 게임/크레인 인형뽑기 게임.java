import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
       // 스택 선언
        Stack<Integer>[] lines = new Stack[board.length];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Stack<>();
        }

        // 스택 쌓기(스택의 특성 생각해서 역순으로)
        for (int i = lines.length - 1; i >= 0; i--) {
            for (int j = 0; j < lines.length; j++) {
                if (board[i][j] > 0) {
                    lines[j].push(board[i][j]);
                }
            }
        }

        // 바구니 선언
        Stack<Integer> bucket2 = new Stack<>();
        int cnt = 0; // 제거한 인형 수

        for (int move : moves) {
            if (!lines[move - 1].isEmpty()) {
                int doll = lines[move-1].pop();
                if(!bucket2.isEmpty() && bucket2.peek() == doll){
                    bucket2.pop();
                    cnt+=2;
                }else {
                    bucket2.push(doll);
                }
            }
        }
        return cnt;
    }
}