public int height(Treenode node) {
    if (node == null) 
        return -1
    
    return 1 + Math.max(height(node.left), height(node.right));
}


public void breadth(Treenode node) {
    if (node == null)
        return;
    
    queue.add(node);

    while (!queue.isEmtpy()) {
        Treenode node = queue.remove();
        node.visit();
        if (node.left != null) {queue.add(node.left);}
        if (node.right != null) {queue.add(node.right);}
    }
}

// DEPTH FIRST SEARCH

public void preorder(Treenode node) {
    if (root == null)
        return;

    node.visit;
    
    preorder(node.left);
    
    preorder(node.right);



}

public void inorder(Treenode node) {
    if (root == null)
        return;

    preorder(node.left);

    node.visit;
    
    preorder(node.right);

}

public void postorder(Treenode node) {
    if (node == null)
        return;

    postorder(node.left);
            
    postorder(node.right);

    node.visit;


}

// CHECK IF GIVEN TREE IS BINARY SEARCH TREE = BST //BAD VERSION

public boolean isBST(Treenode node) {
    if (root == null) {return true;}

    if (isSubtreeLesser(node.left, node.item) && isSubtreeGreater(node.right. node.item))
        return isBST(node.left) && isBST(node.right);

}

//BEST VERSION USING MIN and MAX Values

public boolean isBST(Treenode node, int minValue, int maxValue) {
      if (node == null) {return true;}

      if (node.item > minValue && node.item < maxValue) {
          return isBST(node.left, minValue, node.item) && isBST(node.right, node.item, maxValue);
      } else {
          return false;
      }


}

public boolean isBinarySearchTree() {

    return isBST(root, Integer.MAX, Integer.MIN);
}



//Check if all values are lesser

bool isSubtreeLesser(Treenode node, int value) {
    if (root == null) {return true;}

    if (root.item <= value)
        return isSubtreeLesser(node.left, value) && isSubtreeLesser(node.right, value));
    else
        return false;
    
}


// DELETING A NODE
// LEAF NODE: CUT OFF LINK, 1 STEP
// 1 Child, replace the child with deleted node
// 2 Children: then TAKE MINIMIUM OF RIGHT SUBTREE, COPY VALUE, and DELETE DUPLICATE
// OR               TAKE MAX of LEFT SUBTREE, COPY VALUE< DELETE DUPLICATE


public Treenode delete(Treenode node, int item) {
    if (node == null) {return node;}
    if (item < node.item) {root.left = delete(root.left, item)}
    if (item > node.item) {root.right = delete(root.right, item)}

    //CASE 1 NO Children
    if (node.left == null && node.right == null) {
        delete node;
    }

    //Case 2 One Child
    if (root.left == null) {
        Treenode temp = node;
        node = node.right
        delete temp;
        return node;

    }

    if (root.right == null) {
        Treenode temp = node;
        node = node.left
        delete temp;
        return node;

    }
    //Case 3 2 Chidlren

    if (node.left !=null && node.right != null) {
        Treenode temp = FindMin(node.right)
        node.item = temp.item;
        node.right = Delete(node.right, temp.item);
        return node;


    }
    



}

public Treenode delete(int item) {

    return delete(root, item);

}



// Insertion

public void insert(Treenode node, int item) {
    
    if (item < node.item) {
        if (node.left == null) {
            node.left = new Treenode(item);
        } else {
            insert(node.left, item);
        }

    }
    
    if (item > node.item) {
        if (node.left == null) {
            node.right = new Treenode(item);
        } else {
            insert(node.right, item);
        }

    }


}

public void insert(int item) {
    if (root == null) {root = new TreeNode(item)}
    else {
        insert(root, item);
    }


}