package Implementation;

public class Graph_WithDLL {
    private int V;
    public DLL[] adjList;

    public Graph_WithDLL(int V) {
        this.V = V;
        adjList = new DLL[V];

        for(int it = 0; it < V; it++) {
            adjList[it] = new DLL();
        }
    }

    public void addEdge(int s, int d) {
        adjList[s].insertAtTail(d);
    }

    public void print() {
        System.out.println("Adjacency List representation");

        for(int it = 0; it < V; it++) {
            System.out.print(it + " -> ");

            DLLNode cur = adjList[it].getHead();
            while(cur != null) {
                System.out.print(cur.data + ", ");
                cur = cur.next;
            }
            System.out.println();
        }
    }

    public int getNumOfVertices() {
        return V;
    }
}
