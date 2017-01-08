/**
 * Created by Micah on 12/30/2016.
 */

import java.util.Random;

public class Board {
    GraphNode[][] graph;
    Random r;

    public Board(int n, int m, int b) {
        graph = new GraphNode[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = new GraphNode();
            }
        }

        r = new Random();
    }
}
