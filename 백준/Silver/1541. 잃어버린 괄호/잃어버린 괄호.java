import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] splitStr = str.split("-");

        int result = 0;
        for (int i = 0; i < splitStr.length; i++) {
            int splitSum = 0;

            String[] additionSplit = splitStr[i].split("\\+");
            for (String s : additionSplit) {
                splitSum += Integer.parseInt(s);
            }

            if(i == 0) {
                result += splitSum;
            }else {
                result -= splitSum;
            }
        }
        System.out.println(result);
    }
}
