import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cf_500a_new_year_transportation {
    
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = in.readLine().split(" ");
        String[] secondLine = in.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int t = Integer.parseInt(firstLine[1]);
        // construccion del grafo
        int adj[] = new int[n-1];
        for(int i = 0; i<n-1; i++){
            adj[i] = Integer.parseInt(secondLine[i])+i;
        }
        // dfs
        int portal = 0;
        String rta = "NO";
        do{
            portal = adj[portal];
            if(portal==t-1){
                rta = "YES";
            }
        } while(portal<n && portal<t-1);
        System.out.println(rta);
    }
}
