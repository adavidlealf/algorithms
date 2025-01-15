import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_158b_taxi {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String [] numStrings = in.readLine().split(" ");
        int [] groups = new int[4];
        for(String numString : numStrings){
            groups[Integer.parseInt(numString)-1]++;
        }
        n = groups[3];
        if(groups[2]>0){
            n += groups[2];
            groups[0] -= groups[2];
        }
        if(groups[1]>0){
            n += (groups[1]/2);
            if(groups[1]%2!=0){
                n += 1;
                groups[0] -= 2;
            }
        }
        n += (groups[0]>0 ? (groups[0]/4 + (groups[0]%4==0 ? 0 : 1)) : 0);
        System.out.println(n);
    }
}