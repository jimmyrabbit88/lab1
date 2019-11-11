package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListGraph extends AbstractGraph{
    private ArrayList<LinkedList<Edge>> adjacencyLists;

    public ListGraph(int nv, boolean directed) {
        super(nv, directed);
        adjacencyLists = new ArrayList(nv);
        for (int i = 0; i < nv; i++) {
            //adjacencyLists.add(i, new LinkedList());
            adjacencyLists.add(new LinkedList());
        }
    }

    @Override
    public boolean isEdge(int source, int dest) {
        return false;
    }

    @Override
    public void insert(Edge edge) {

    }

    @Override
    public void remove(Edge edge) {

    }
}
