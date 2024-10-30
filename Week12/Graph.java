import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    //arrays-continous and immutable
    //linked list-discont and mutable
    //stacks and queues-arrays or linked list
    //hashmap heaps-key value pair store
    //trees-binary tree, bst
    //graphs like tree but no parents can be connected anylike directed or undirected
    //graphs-directed and undirected graph or connection or edge
    //weighted graph
    //directed and weighted a to b 100 b to a 100
    //adjacency matrix 2d array
    //zero matrix also possible and space is wasted so to avoid that we use arraylist and that is dynamic
    //adjacency list
    //pair for weighted adjacency list if no weight then common 1 and 0 so no edge
    //weighted list we use pair
    //we use hashmap of [keyint,valuehashmap(keyi,valuei)] for weighted list
    HashMap<Integer , HashMap<Integer,Integer>> map;
    public  Graph(int v){
        this.map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost); //if comment this then directed else undirected
    }
    public boolean containsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }
    public boolean ContainsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noofEdge(){
        int sum=0;
        for(int key : map.keySet()){
            sum=sum+map.get(key).size();
        }
        return sum/2;
    }
    public void removeEdge(int v1,int v2){
        if(containsEdge(v1, v2)){
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }
    public void removevertex(int v1){
        for(int key: map.get(v1).keySet()){
            //removedEdge(key,v1);
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }
    public void display(){
        for(int key: map.keySet()){
            System.out.println(key+"-->"+map.get(key));
        }
    }
    public boolean hashpath(int src,int dis,HashSet<Integer> visited){
        if(src==dis){
            return true;
        }
        visited.add(src);
        for(int nbrs : map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                boolean ans = hashpath(nbrs,dis,visited);
                if(ans){
                    return ans;
                }
            }
        }
        visited.remove(src);
        return false;
    }
    public void printallpath(int src,int dis,HashSet<Integer> visited, String ans){
        if(src==dis){
            System.out.println(ans+src);
            return;
        }
        visited.add(src);
        for(int nbrs : map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                printallpath(nbrs, dis, visited, ans + src + " ");
            }
        }
        visited.remove(src);
    } 
}
