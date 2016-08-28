BFS(Vertex v) {

    Queue<> q = new ArrayList<>();
    Set<> visited = new HashSet<>();

    visited.add(v);
    q.push(v);

    while (!q.empty()) {
        
        Vertex u = q.dequeue();

        for (neighbor : getNeighbors()) {
           
            if (!visited.contains(neighbor)) {
                
                visited.add(neighbor); //processs Vertex
                q.push(w)

            }
           

        }

    }

}


// 1. Dequeue Vertex
// 2. Visit unvisted neighbors and add to queue.