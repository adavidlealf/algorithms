import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_96a_football {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        int racha = 0;
        String rta = "NO";
        for(int i = 1; i<line.length(); i++){
            racha = (line.charAt(i)==line.charAt(i-1)? racha+1 : 0);
            if(racha==6){
                rta = "YES";
                break;
            }
        }
        System.out.println(rta);
    }
}
