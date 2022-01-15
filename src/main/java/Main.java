import draw.AwtDrawingApi;
import draw.DrawingApi;
import draw.JavaFxDrawingApi;
import graph.AdjMatrixGraph;
import graph.EdgeListGraph;
import graph.Graph;

public class Main {
    public static void main(final String[] args) {
        if (args == null || args.length != 2) {
            System.err.println("Usage: fx/awt list/matrix");
            return;
        }

        DrawingApi api;
        switch (args[0]) {
            case "fx":
                api = new JavaFxDrawingApi();
                break;
            case "awt":
                api = new AwtDrawingApi();
                break;
            default:
                System.err.println("Expected fx or awt, found " + args[1]);
                return;
        }

        final int vertices = 13;
        Graph graph;
        switch (args[1]) {
            case "list":
                graph = new EdgeListGraph(api, vertices);
                break;
            case "matrix":
                graph = new AdjMatrixGraph(api, vertices);
                break;
            default:
                System.err.println("Expected list or matrix, found " + args[2]);
                return;
        }

        for (int v = 0; v < vertices; ++v) {
            for (int u = v + 1; u < vertices; ++u) {
                graph.addEdge(v, u);
            }
        }
        graph.draw();
    }
}
