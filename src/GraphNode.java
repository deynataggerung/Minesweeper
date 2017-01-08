/**
 * Created by Micah on 12/30/2016.
 */
public class GraphNode {
    public enum Direction {N, NE, E, SE, S, SW, W, NW};

    GraphNode[] adjacency = new GraphNode[8];

    protected int value;
    protected int adjCount;
    protected boolean shown;



    public GraphNode(GraphNode in, GraphNode ine, GraphNode ie, GraphNode ise, GraphNode is, GraphNode isw, GraphNode iw, GraphNode inw, int ivalue, int validNeighbors) { //i stands for input
        adjacency[0] = in;
        adjacency[1] = is;
        adjacency[2] = ie;
        adjacency[3] = iw;
        adjacency[4] = ine;
        adjacency[5] = inw;
        adjacency[6] = ise;
        adjacency[7] = isw;

        value = ivalue;
        shown = false;
        adjCount = validNeighbors;
    }

    public GraphNode() {
        this(null, null, null, null, null, null, null, null, 0, 0);
    }

    public boolean isBomb() {
        if (value == -1) {
            return true;
        }

        return false;
    }

    /*
    public GraphNode getAdjacent(Direction dir) {
        switch(dir) {
            case N:
                return n;
            case NE:
                return ne;
            case E:
                return e;
            case SE:
                return se;
            case S:
                return s;
            case SW;
                return sw;
            case W:
                return w;
            case NW:
                return nw;
            default:
                return null;
        }
    } */

    public void addAdjacent(int dir, GraphNode in) { // this is likely just for initialization purposeses.
        adjacency[dir] = in;

        return;
    }

    public void show() {
        shown = true;
    }

    public void update(int ivalue) {
        value = ivalue;
    }

    public void add(int num) {
        value += num;
    }

    public void bombMe() {
        value = -1;

        for (GraphNode i : adjacency) {
            if (i != null && !i.isBomb()) {
                i.add(1);
            }
            else if (i.isBomb()) {

            }
        }
    }

    public static void main(String[] args) {
        GraphNode test = new GraphNode();

        
    }


}
