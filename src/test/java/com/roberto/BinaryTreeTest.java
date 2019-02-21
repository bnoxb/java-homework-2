package com.roberto;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void CanInsertNode(){
        BinaryTree myTree = new BinaryTree();
        myTree.insertNode(5);
        myTree.insertNode(3);
        myTree.insertNode(7);
        myTree.insertNode(20);
        myTree.insertNode(15);
        myTree.insertNode(18);
        myTree.insertNode(4);
        myTree.insertNode(1);
        myTree.insertNode(2);
        myTree.insertNode(16);
        myTree.insertNode(17);
        myTree.insertNode(5);
        assertEquals("Did not insert first Node", 5, myTree.getRoot().getValue());
        assertEquals("Did not insert left", 3, myTree.getRoot().getLeft().getValue());
        assertEquals("Did not insert right", 7, myTree.getRoot().getRight().getValue());
        assertEquals("did not insert 2", 2, myTree.getRoot().getLeft().getLeft().getRight().getValue());
        assertEquals("did not insert 18", 18, myTree.getRoot().getRight().getRight().getLeft().getRight().getValue());
        assertEquals("did not insert 16", 16, myTree.getRoot().getRight().getRight().getLeft().getRight().getLeft().getValue());
        assertEquals("did not insert 17", 17, myTree.getRoot().getRight().getRight().getLeft().getRight().getLeft().getRight().getValue());
    }

    @Test
    public void CanInsertTim(){
        BinaryTree myTree = new BinaryTree();
        myTree.insertNode(7);
        myTree.insertNode(5);
        myTree.insertNode(9);
        myTree.insertNode(11);
        assertEquals("Not right of right", 11, myTree.getRoot().getRight().getRight().getValue());
        myTree.insertNode(13);
        assertEquals("Not right of right of right", 13, myTree.getRoot().getRight().getRight().getRight().getValue());
        myTree.insertNode(4);
        assertEquals("Not left of left", 4, myTree.getRoot().getLeft().getLeft().getValue());
        myTree.insertNode(10);
        assertEquals("not left of right of right", 10, myTree.getRoot().getRight().getRight().getLeft().getValue());
        myTree.insertNode(2);
        assertEquals("not left of left of left", 2, myTree.getRoot().getLeft().getLeft().getLeft().getValue());
        myTree.insertNode(3);
        assertEquals("not right of left of left of left", 3, myTree.getRoot().getLeft().getLeft().getLeft().getRight().getValue());

    }
}
