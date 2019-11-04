package Graphs;
public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge
    
    private double[][] matrix;
    
    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                    matrix[row][col] = 0.0;        
    }

    public boolean isEdge(int source, int dest) {
        if(matrix[source][dest] == 1){
            return true;
        }
        return false;
    }

    public void insert(Edge edge) {
        matrix[edge.getSource()][edge.getDestination()] = 1;
        if(!this.isDirected()){
            matrix[edge.getDestination()][edge.getSource()] = 1;
        }
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge  
    }

    public void remove(Edge edge) {
        matrix[edge.getSource()][edge.getDestination()] = 0;
        if(!this.isDirected()){
            matrix[edge.getDestination()][edge.getSource()] = 0;
        }
        //complete this method
        // as for insert method

    }
    
    public void breadthFirstTraversal(int start){
	//Output the vertices in breadth first order
    }
    
    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
    }    
}