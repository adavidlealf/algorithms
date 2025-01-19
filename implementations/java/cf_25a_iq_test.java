import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_25a_iq_test {
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String firstLine [] = in.readLine().split(" ");
        boolean par = 
            (Integer.parseInt(firstLine[0])%2==0 && Integer.parseInt(firstLine[1])%2==0)
            || (Integer.parseInt(firstLine[0])%2==0 && Integer.parseInt(firstLine[n-1])%2==0)
            || (Integer.parseInt(firstLine[1])%2==0 && Integer.parseInt(firstLine[n-1])%2==0);
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(firstLine[i]);
            if((num%2==0 && !par) || (num%2!=0 && par)){
                System.out.println(i+1);
                break;
            }
        }
    }
}
