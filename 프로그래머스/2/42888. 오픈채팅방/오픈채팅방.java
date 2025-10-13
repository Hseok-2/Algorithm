import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> userInfo = new HashMap<>();
        ArrayList<String> commandList = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            StringTokenizer st = new StringTokenizer(record[i]);
            String command = st.nextToken();
            String uId = st.nextToken();
            switch(command) {
                case "Enter":
                    userInfo.put(uId, st.nextToken());
                    commandList.add("Enter " + uId);
                    break;
                case "Leave":
                    commandList.add("Leave " + uId);
                    break;
                case "Change":
                    userInfo.put(uId, st.nextToken());
                    break;
            }
        }

        ArrayList<String> answer = new ArrayList<>();
        for (String str : commandList) {
            StringTokenizer st = new StringTokenizer(str);
            String command = st.nextToken();

            if (command.equals("Enter")) {
                answer.add(userInfo.get(st.nextToken()) + "님이 들어왔습니다.");
            } else if (command.equals("Leave")) {
                answer.add(userInfo.get(st.nextToken()) + "님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[answer.size()]);
    }
}