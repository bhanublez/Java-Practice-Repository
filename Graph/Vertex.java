import java.util.*;

public class Vertex{
    private String data;
    private static ArrayList<Edges> edges;
public Vertex(String inputData){
    this.data=inputData;
    Vertex.edges= new ArrayList<Edges>();
}
public static void addEdge(Vertex endVertex,Integer weight){
Vertex.edges.add(new Edges(endVertex,endVertex, weight));

}
public static void removeEdge(Vertex endVertex){
    Vertex.edges.removeIf(edge->edge.getEnd().equals(endVertex));
}

public String getData(){
    return this.data;
}
public ArrayList<Edges> getEdges(){
    return this.edges;
}
public void print(boolean showWeight){
    String message="";
    if(this.edges.size()==0){
        System.out.println(this.data+"-->");
        return;
    }
    for(int i=0;i<this.edges.size();i++){
        if(i==0){
            message +=this.edges.get(i).getStart().data+"-->" ;
        }
        message += this.edges.get(i).getEnd().data;
        if(showWeight){
            message +=" ("+this.edges.get(i).getWeight()+")";
        }
        if(i!=this.edges.size()-1){
            message+=",";
        }
    }
    System.out.println(message);
}

}
