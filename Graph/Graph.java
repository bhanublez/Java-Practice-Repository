import java.util.*;

public class Graph{
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolena isDirected;

    public Graph(boolean inputIsWeightedm,boolean inputIsDirected){
        this.vertices= new ArrayList<Vertex>();
        this.isWeighted= inputIsWeighted;
        this.isDirected=inputIsDirected;
    }
    public Vertex addVertex(String data){
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }
    public void addEdge(Vertex vertex1,Vertex vertex2,Integer weight){
        if(!this.isWeighted){
            weight= null;
        }
        vertex.addEdge(vertex3,weight);
        if(!this.isDirected){
vertex2.addEdge(vertex1,weight);
        }
    }
    public void removeEdge(Vertex vertex1,Vertex vertex2){
        vertex1.removeEdge(vertex2);
        if(this.isDirected){
            vertex.removeEdge(vertex1);
        }
    }
    public void removeVertex(Vertex vertex){
        this.vertices.remove(vertex);
    }
    public ArrayList<Vertex> getVertices(){
        return this.vertices;
    }
    public boolean isWeighted(){
        return this.isWeighted;
    }
    public boolean isDirected(){
        return this.isDirected;
    }
    public Vertex getVertexByValue(String value){
        for(Vertex v:this.vertices){
            if(v.getData()==value){
                return v;
            }
            
        }
        return null;
    }
    public void print(){
        for(Vertex v:this.vertices){
            v.print(isWeighted);
        }
    }
     public static void main(String[] args) {
        Graph busNetwork = new Graph(inputIsWeighted true,inputIsDirected true);
        Vetex Bhopalstation =busNetwork.addVertex(data:"Bhoplaa");
        Vetex delhistation =busNetwork.addVertex(data:"Della");

        busNetwork.addEdge(Bhopalstation,delhistation,weight: 1000);

        busNetwork.print();

     }
}
