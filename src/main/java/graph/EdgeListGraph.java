package graph;

import draw.DrawingApi;
import entity.Pair;

import java.util.ArrayList;
import java.util.List;

public class EdgeListGraph extends Graph {
    private final List<Pair<Integer, Integer>> edges;

    public EdgeListGraph(final DrawingApi api, final int vertices) {
        super(api, vertices);
        edges = new ArrayList<>();
    }

    @Override
    public void addEdge(final int from, final int to) {
        edges.add(new Pair<>(from, to));
    }

    @Override
    protected List<Pair<Integer, Integer>> getEdges() {
        return edges;
    }
}
