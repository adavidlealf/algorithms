import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_455a_boredom {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        n = 100000+1;
        String[] numbersStr = in.readLine().split(" ");
        long [] counterNumbers = new long[n];
        for(String numStr : numbersStr){
            Integer num = Integer.parseInt(numStr);
            counterNumbers[num]++;
        }
        long[] score = new long[n];
        score[1] = counterNumbers[1];
        for(int i=2; i<n; i++){
            score[i] = Math.max(score[i-1], score[i-2] + ((long) counterNumbers[i]*i));
        }
        System.out.println(score[n-1]);
    }
}