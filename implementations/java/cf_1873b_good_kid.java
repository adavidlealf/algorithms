import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_1873b_good_kid {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            int n = Integer.parseInt(in.readLine());
            String [] a = in.readLine().split(" ");
            n = 11;
            int [] prods = new int[n];
            for(String ai : a){
                prods[Integer.parseInt(ai)]++;
            }
            boolean changed = false;
            int prod = 1;
            for(int i=0; i<11; i++){
                if(!changed && prods[i]!=0){
                    changed = true;
                    prods[i]--;
                    prods[i+1]++;
                }
                prod *= (prods[i]>0? Math.pow(i, prods[i]) : 1);
            }
            System.out.println(prod);
        }
    }
}