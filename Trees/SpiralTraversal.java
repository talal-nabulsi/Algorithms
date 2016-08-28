void spiral(Node node) {

Stack<Node> s1 = new Stack<Node>();
Stack<Node> s2 = new Stack<Node>();

s1.push(node);

while (!s1.isEmpty() || s2.isEmpty()) {

    while (s1.isEmpty()) {
        Node curr = s1.pop();

        if (node.left != null) {
            s2.push(node.left);
        }

        if (node.right != null) {
            s2.push(node.right);
        }



    }

     while (s2.isEmpty()) {

        Node curr = s2.pop();

        if (node.right != null) {
            s1.push(node.right);
        }

        if (node.left != null) {
            s1.push(node.left);
        }

    



    }




}






}