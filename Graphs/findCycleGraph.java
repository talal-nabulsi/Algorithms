boolean findCycle(Graph g) {

Set<Node> visited = new HashSet<>();
Set<Node> recstack = new HashSet<>();

for (Node node : g.getAllVetices) {

    return findCycle(node, null), visited, recstack;

}



private boolean findCycle(Node node, Node lastNode, Set<Node> visited, Set<Node> recstack) {

    recstack.add(node)

    for (Node n : node.getAllNeighbors) {

        if (n == lastNode || visited.contains(node)) {
            continue;
        }

        if (recstack.contains(node)){
            return true;
        }

        if (findCycle(n, node, visited, recstack)) {
            return true;
        }

    }

    recstack.remove(node);
    visited.add(node);
    return false;








}

