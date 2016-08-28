// DFS Nonrecusrive traversal

void DFS(Vertex v) {

    Stack<> s = new Stack<>();
    Set<> visited = new HashSet<>();
    s.push(v) 

    while (!s.empty()) {
        curr = s.pop() // pop from stack
        
        if (!visited.contains(curr)) {
            
            visited.add(curr) // add to visited set
            // process vertex
            for (neighbor : v.getNeighbrs()) {

                if (!visited.contains(v)) {
                    s.push(neighbor);
                }
            }
        }
    }
}

// 1. Pop of the stack
// 2. If not viisted then visit and add unvisited neighbors





//Recursive DFS

void DFS(Vertex v) {

    if (visited.contains(v)) {
        return;
    }

    visited.add(v);
    //vist and process vertex

    for (neighbors : v.getNeighbrs()) {

        if (!visited.contains(v)) {
            DFS(neighbor);
        }

    }

}