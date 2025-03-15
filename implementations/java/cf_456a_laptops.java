import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_456a_laptops {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int [] numbers = new int[100000];
        int mayor = 0, menor = 100000-1;
        for(int i =0; i<n;i++){
            String[] line = in.readLine().split(" ");
            int a = Integer.parseInt(line[0])-1, b =Integer.parseInt(line[1]);
            numbers[a] = b;
            mayor = (a>mayor? a : mayor);
            menor = (a<menor? a : menor);
        }
        boolean happy = false;
        for(int i = menor+1; i<=mayor; i++){
            if(numbers[i]<numbers[i-1]){
                happy = true;
                break;
            }
        }
        if(happy){
            System.out.println("Happy Alex");
        } else{
            System.out.println("Poor Alex");
        }
    }
}
