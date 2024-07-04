import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			al.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(al);
		
		for(int i : al) {
			bw.write(i + "\n");
		}
        bw.flush();
	}
	
}
