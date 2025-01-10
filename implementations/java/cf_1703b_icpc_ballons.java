import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class cf_1703b_icpc_ballons {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            int n = Integer.parseInt(in.readLine());
            String s = in.readLine();
            HashSet<Character> hs = new HashSet<>();
            for(int i = 0; i<n; i++){
                hs.add(s.charAt(i));
            }
            System.out.println(n+hs.size());
        }
    }
}
