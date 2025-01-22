import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class cf_4c_registration_system {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Map<String,Integer> mapa = new HashMap<>();
        int numTmp;
        for(int i=0; i<n; i++){
            String temp = in.readLine();
            if(mapa.containsKey(temp)){
                numTmp = mapa.get(temp)+1;
                mapa.put(temp, numTmp);
                System.out.println(temp+String.valueOf(numTmp));
            } else {
                mapa.put(temp, 0);
                System.out.println("OK");
            }
        }
    }
}
