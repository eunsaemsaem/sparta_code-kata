import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄에서 숫자 2개를 분리하기 위한 tokenizer
        StringBuilder sb = new StringBuilder(); // 결과 출력을 위한 string builder
        sb.append("<");

        int n = Integer.parseInt(st.nextToken()); // n명의 사람
        int k = Integer.parseInt(st.nextToken()); // k번째를 제거

        /* Queue 선언 */
        Queue<Integer> queue = new LinkedList<>();

        /* queue에 1~n 값 넣기 */
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        /* k번째 값이 될 때까지 값을 뺐다가 맨 뒤에 다시 넣고, k번째에는 값을 poll해서 sb에 저장 */
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                int temp = queue.poll();
                queue.add(temp);
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll());
        sb.append(">");

        System.out.println(sb);
    }
}