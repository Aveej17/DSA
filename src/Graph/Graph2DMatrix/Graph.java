package Graph.Graph2DMatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph{
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int [][] adjacencyMatrix;

    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int [nodeList.size()][nodeList.size()];
    }


    public void addUndirectedEdge(int i, int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }


    // get neighbours
    public ArrayList<GraphNode> getNeighbours(GraphNode node){
        ArrayList<GraphNode> neighbours = new ArrayList<>();
        int nodeIndex = node.index;
        for(int i = 0; i<adjacencyMatrix.length; i++){
            if(adjacencyMatrix[nodeIndex][i] == 1){
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;
    }


    // BFS internal
    public void bfsVisit(GraphNode node){
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNode currentNode = queue.poll();
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" ");
            ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
            for (GraphNode neighbour : neighbours){
                if(!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }


    //BFS
    public void bfs(){
        for(GraphNode node : nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }

    // prints the graph to the console

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for(int i=0; i<nodeList.size(); i++){
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");

        for(int i=0; i<nodeList.size(); i++){
            s.append(nodeList.get(i).name + ": ");
            for(int j=0; j<nodeList.size(); j++){
                s.append(adjacencyMatrix[i][j] + " ");
            }
            s.append("\n");
        }

        return s.toString();
    }
}