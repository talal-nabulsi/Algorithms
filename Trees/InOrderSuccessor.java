node getSuccessor(int item) {

    return getSucessor(root, item);

}





node getSucessor(Node root, int item) {

    Node curr = find(node, item);
    if (curr == null) {return null}

    if (curr.right != null){       //Case 1, 
        return findMin(curr.right)
    }

    Node successor = null;
    Node ancestor = root;

    //Case 2

    while (ancestor != curr) {

        if (curr.item < ancestor.item) {
            succesor = ancestor;
            ancestor = ancestor.left
        } else {
            ancestor = ancestor.right

        }



    }




}