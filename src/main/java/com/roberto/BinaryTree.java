package com.roberto;

public class BinaryTree {
    private BTNode root;

    public BinaryTree() {
    }

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public BinaryTree insertNode(int value){
        // set newNode to a new node
        BTNode newNode = new BTNode(value);
        // check to see if this.root exists if not make it a node.
        if(this.root == null){
            this.root = newNode;
        }else{
            BTNode currentNode = this.root;
            insertRecursion(currentNode, value, newNode);
        }
        return this;
    }

    public BTNode insertRecursion(BTNode currentNode, int value, BTNode newNode){
        if(value > currentNode.getValue()){
            if(currentNode.getRight() != null){
                currentNode = currentNode.getRight();
                return insertRecursion(currentNode, value, newNode);
            }else{
                currentNode.setRight(newNode);
                return currentNode.getRight();
            }
        }else if(value < currentNode.getValue()){
            if(currentNode.getLeft() != null) {
                currentNode = currentNode.getLeft();
                return insertRecursion(currentNode, value, newNode);
            }else{
                currentNode.setLeft(newNode);
                return currentNode.getLeft();
            }
        }

        return currentNode;
    }
}
