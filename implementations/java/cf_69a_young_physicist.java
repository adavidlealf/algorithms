import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_69a_young_physicist {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int comps [] = new int[3];
        while(n-->0){
            String linea [] = in.readLine().split(" ");
            for(int i=0; i<3; i++){
                comps[i] += Integer.parseInt(linea[i]);
            }
        }
        String rta = "YES";
        for(int num : comps){
            if(num!=0){
                rta = "NO";
                break;
            }
        }
        System.out.println(rta);
    }
}
