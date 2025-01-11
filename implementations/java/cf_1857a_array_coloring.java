import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_1857a_array_coloring {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String numsStr[] = in.readLine().split(" ");
            int suma = 0;
            for(int i = 0; i < n; i++){
                suma += Integer.parseInt(numsStr[i]);
            }
            System.out.println(suma % 2 == 0 ? "YES" : "NO");
        }
    }
}
