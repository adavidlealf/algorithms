import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_122a_lucky_division {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        boolean lucky = false;
        int divisores[] = { 4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777 };
        for (int i = 0; (i < divisores.length && !lucky); i++) {
            lucky |= (Integer.parseInt(line) % divisores[i] == 0);
        }
        System.out.println(lucky ? "YES" : "NO");
    }
}
