import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_479a_expression {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());
        int maximo = Math.max(a*b*c, 
                    Math.max(a+b*c,
                    Math.max(a*b+c,
                    Math.max((a+b)*c,
                    Math.max(a*(b+c), a+b+c
        )))));
        System.out.println(maximo);
    }
}
