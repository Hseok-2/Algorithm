import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 차량 대수

        // 들어간 차의 순서를 저장 
        HashMap<String, Integer> inCar = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String carNo = br.readLine();
            inCar.put(carNo, i);
        }

        // 나오는 차는 순서 배열에 저장
        String[] outCar = new String[n];
        for (int i = 0; i < n; i++) {
            outCar[i] = br.readLine();
        }

        int count = 0;

        // 터널을 나온 차들을 순서대로 확인
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // 현재 나온 차보다 뒤에 나온 차 하나씩 비교
                
                int currentCarInIdx = inCar.get(outCar[i]); // 현재 차가 들어간 순서
                int nextCarInIdx = inCar.get(outCar[j]);    // 뒤에 있는 차가 들어간 순서

                // 만약 뒤에 나온 차가 먼저 들어왔던 차라면? 
                // -> 현재 차가 그 차를 추월했다는 뜻
                if (currentCarInIdx > nextCarInIdx) {
                    count++;
                    break; // 한 대라도 추월했으면 카운트하고 다음 차로 넘어감
                }
            }
        }

        System.out.println(count);
    }
}