import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static Deque<Integer> q = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    push(x);
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int x) {
        q.offer(x);
    }

    public static int pop() {
        if(q.isEmpty()) return -1;
        return q.poll();
    }

    public static int size() {
        return q.size();
    }

    public static int empty() {
        if(q.isEmpty()) return 1;
        else return 0;
    }

    public static int front() {
        if(q.isEmpty()) return -1;
        return q.peek();
    }

    public static int back() {
        if(q.isEmpty()) return -1;
        return q.peekLast();
    }
}