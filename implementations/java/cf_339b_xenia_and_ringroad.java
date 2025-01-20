import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_339b_xenia_and_ringroad {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] firstLine = in.readLine().split(" ");
        String [] secondLine = in.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);
        int index = 1, temp;
        long contador = 0;
        for(int i=0; i<m; i++){
            temp = Integer.parseInt(secondLine[i]);
            if(index<=temp){
                contador += ((long) temp-index);
            } else {
                contador += ((long) n-index+temp);
            }
            index = temp;
        }
        System.out.println(contador);
    }
}
