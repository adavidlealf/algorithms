import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_4a_watermelon {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(in.readLine());
        String sol = (w>2 && w%2==0 ? "YES" : "NO");
        System.out.println(sol);
    }
}
