
    import java.util.ArrayList;
    public class bfs {
    static class edge{
        int src;
        int dest;
        int wt;
        public edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2,1));

        graph[1].add(new edge(1,2,4));
        graph[1].add(new edge(1,3,5));

        graph[2].add(new edge(2,0,-3));
        graph[2].add(new edge(2,1,-5));
        graph[2].add(new edge(2,3,6));

        graph[3].add(new edge(3,1,6));
        graph[3].add(new edge(3,2,9));
        

    }
    public static void dfs(ArrayList<edge>graph[],int curr,boolean vis[]){
        System.out.println(curr + "");
        vis[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            edge e= graph[curr].get(i);
            if(vis[e.dest]==false){
            dfs(graph,e.dest,vis);
            }
        }
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[]=new ArrayList[v];
        createGraph(graph);
        // for(int i=0;i<graph[2].size();i++){
        //     edge e=graph[2].get(i);
        //     System.out.println(e.dest +"," + e.wt);
       // }
            boolean vis[]= new boolean[v];
            dfs(graph,0,vis);
            System.out.println();
        } 
    }
