package graph;

import draw.DrawingApi;

import java.util.ArrayList;
import java.util.List;

public class AdjMatrixGraph extends Graph {
    private final List<List<Integer>> matrix = new ArrayList<>();

    public AdjMatrixGraph(final DrawingApi api, final int vertices) {
        super(api, vertices);

        for (int v = 0; v  < vertices; ++v) {
            final List<Integer> row = new ArrayList<>();
            for (int u = 0; u < vertices; ++u) {
                row.add(0);
            }
            matrix.add(row);
        }
    }

    @Override
    public void addEdge(final int from, final int to) {
        matrix.get(from).set(to, matrix.get(from).get(to) + 1);
    }

    @Override
    public void draw() {

    }
}
