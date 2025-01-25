import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class cf_580c_kefa_and_park {
    
    static int cats [];
    static int n, m, contador;
    static boolean visited[];

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line [] = in.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        m = Integer.parseInt(line[1]);
        cats = new int[n];
        visited = new boolean[n];
        @SuppressWarnings("unchecked")
        List<Integer> adj  [] = new List[n];
        line = in.readLine().split(" ");
        for(int i=0; i<n; i++){
            cats[i] = Integer.parseInt(line[i]);
            adj[i] = new ArrayList<>();
        }
        for(int i=0; i<n-1; i++){
            line = in.readLine().split(" ");
            adj[Integer.parseInt(line[0])-1].add(Integer.parseInt(line[1])-1);
            adj[Integer.parseInt(line[1])-1].add(Integer.parseInt(line[0])-1);
        }
        
        dfs(0, cats[0], adj);
        System.out.println(contador);
    }

    static void dfs(int s, int contadorGatos, List<Integer> adj []){
        if(adj[s].size()==1 && visited[adj[s].get(0)]) contador++;
        else {
            visited[s] = true;
            for(Integer u : adj[s]){
                if(cats[u]+contadorGatos <= m && !visited[u]){
                    dfs(u, (cats[u]==0? 0 : cats[u]+contadorGatos), adj);
                }
            }
        }
    }
}
