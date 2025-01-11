import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_101102e_ya_rajaie_and_books {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            System.out.println((n % 5 == 0 ? n/5 : ((n/5)+1) ));
        }
    }
}
