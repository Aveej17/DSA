package Graph.GraphArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    ArrayList<GraphNode> nodeList  = new ArrayList<>();

    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
    }


    public ArrayList<String> BFS(){
        ArrayList<String> s = new ArrayList<>();
        for(GraphNode node: nodeList){
            if(!node.isVisited) {
                s.addAll(BFS(node));
            }
        }
        return s;
    }

    // BFS Internal
    private ArrayList<String> BFS(GraphNode node){
        ArrayList<String> ans = new ArrayList<>();

        Queue<GraphNode> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            GraphNode currNode = q.poll();
            ans.add(currNode.name);
            currNode.isVisited = true;
            for (GraphNode g : currNode.neighbours) {
                if (!g.isVisited) {
                    q.offer(g);
                    g.isVisited = true;
                }
            }
        }
        return ans;
    }

    public void addUndirectedEdge(int i, int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }

    // prints the graph to the console

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i< nodeList.size(); i++){
            s.append(nodeList.get(i).name+ ": ");
            for(int j = 0; j<nodeList.get(i).neighbours.size(); j++){
                if(j==nodeList.get(i).neighbours.size()-1){
                    s.append((nodeList.get(i).neighbours.get(j).name));
                }
                else{
                    s.append((nodeList.get(i).neighbours.get(j).name)+" -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}
