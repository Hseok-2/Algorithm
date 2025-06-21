import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int floor = 1; // 층
        int endRoomNo = 1; // 해당 층 마지막 방 번호
        int input = Integer.parseInt(br.readLine());

        while (input > endRoomNo) {
            endRoomNo += 6 * floor;
            floor++;
        }

        System.out.println(floor);
    }
}
