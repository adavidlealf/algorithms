import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cf_363b_fence {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = in.readLine().split(" ");
        String[] secondLine = in.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
        int[] results = new int[n];
        int rta = 0;
        for (int i = 0; i < n; i++) {
            results[i] += (Integer.parseInt(secondLine[i]) + (i > 0 ? results[i - 1] : 0));
            if (i >= k) {
                results[i] -= (Integer.parseInt(secondLine[i-k]));
                if(results[i]<results[rta]){
                    rta = i;
                }
            } else{
                rta = i;
            }
        }
        System.out.println(rta-k+2);
    }
}
