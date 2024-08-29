import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgo {

    static class Edge implements Comparable<PrimsAlgo.Edge> {
        int weight;
        int source;
        int destination;

        public Edge(int weight, int source, int destination) {
            this.weight = weight;
            this.source = source;
            this.destination = destination;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void primsAlgo(List<Edge>[] graph) {

        int numVertices = graph.length;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        //create array to track vertices include or not in a mst
        boolean[] mst = new boolean[numVertices];

//         create array to a minimum spanning tree

        List<Edge> inMST = new ArrayList<Edge>();
        int startVertex = 0;
        mst[startVertex] = true;
            // Add all edges from the start vertex to the priority queue

        pq.addAll(graph[startVertex]);
        while (!pq.isEmpty()) {
            Edge minEdge = pq.poll();
            if (!mst[minEdge.destination]) {
                inMST.add(minEdge);
                mst[minEdge.destination] = true;
            }
            for (Edge edge : graph[minEdge.destination]) {
                if (!mst[edge.destination]) {
                    pq.add(edge);
                }
            }
        }
        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : inMST) {
            System.out.println("Edge: " + edge.source + " - " + edge.destination + " Weight: " + edge.weight);
        }
    }
    public static void main(String[] args) {

        List<Edge> [] graph = new ArrayList[5];


        ArrayList<Edge> edgeListNode1 = new ArrayList<>();
        Edge e1 = new Edge(10,0,1);
        Edge e2 = new Edge(8,0,2);
        edgeListNode1.add(e1);
        edgeListNode1.add(e2);
        graph[0] =edgeListNode1;


        ArrayList<Edge> edgeListNode2 = new ArrayList<>();
        Edge e3 = new Edge(15,1,4);
        Edge e4 = new Edge(10,1,0);

        edgeListNode2.add(e3);
        edgeListNode2.add(e4);
        graph[1] = edgeListNode2;

        ArrayList<Edge> edgeListNode3 = new ArrayList<>();
        Edge e5 = new Edge(8,2,0);
        Edge e6 = new Edge(5,2,3);

        edgeListNode3.add(e5);
        edgeListNode3.add(e6);
        graph[2] = edgeListNode3;

        ArrayList<Edge> edgeListNode4 = new ArrayList<>();
        Edge e7 = new Edge(5,3,2);
        Edge e8 = new Edge(12,3,4);

        edgeListNode4.add(e7);
        edgeListNode4.add(e8);
        graph[3] = edgeListNode4;


        ArrayList<Edge> edgeListNode5 = new ArrayList<>();
        Edge e9 = new Edge(12,4,3);
        Edge e10 = new Edge(15,4,1);

        edgeListNode5.add(e9);
        edgeListNode5.add(e10);
        graph[4] = edgeListNode2;

        primsAlgo(graph);

    }
}
