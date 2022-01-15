package graph;

import draw.DrawingApi;

public abstract class Graph {
    /**
     * Bridge to drawing api
     */
    private final DrawingApi api;

    protected final int vertices;

    protected Graph(final DrawingApi api, final int vertices) {
        this.api = api;
        this.vertices = vertices;
    }

    public abstract void addEdge(final int from, final int to);

    public abstract void draw();
}
