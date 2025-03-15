import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_118a_string_task {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine().toLowerCase();
        StringBuilder sb = new StringBuilder();
        int [] excepciones = {'a','e','i','o','u','y'};
        for(int i=0; i< s.length(); i++){
            boolean b = false;
            for(int j=0; j<excepciones.length; j++){
                if(s.charAt(i)==excepciones[j]){
                    b = true;
                    break;
                }
            }
            if(!b){
                sb.append(".").append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
