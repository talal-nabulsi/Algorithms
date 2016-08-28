//ONLY WORKS ON DAG - DIRECTED ACYCLIC GRAPH
//DAG DAG DAG DAG DAG 
// RETURN VERTICES IN REVERSE POSTORDER
//REVERSE POSTORDER 


public class DepthFirstOrder {

private HashSet<Integer> visited;
private Stack<Integer> stack;


public topologicalSort(Graph G) {

    stack = new Stack<Integer>();
    visited = new HashSet<Integer>;

    for (int v = 0; i < G.V(); v++) {
        if (!visited.contains(v)) topologicalSort(v)}
    }
}

private topologicalSort(int v, Stack<Integer> stack, HashSet<Integer> visited) {
    visited.add(v)
    for (int v : getAllNeighbors(v)) {
        if(!visited.contains(v)) {topologicalSort(v);}
    }

    stack.push(v, stack, visited);


}








}