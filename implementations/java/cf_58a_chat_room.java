import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_58a_chat_room {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int lastIndice = 0;
        boolean hello = true;
        for(char letra : "hello".toCharArray()){
            lastIndice = s.indexOf(letra, lastIndice);
            if(lastIndice == -1){
                hello = false;
                break;
            }
            lastIndice++;
        }
        System.out.println(hello? "YES": "NO");
    }
}
