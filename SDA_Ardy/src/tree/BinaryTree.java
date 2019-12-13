/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author LAB-316-28
 */
public class BinaryTree {

    private Nodes root;

    public Object find(int key) {
        Nodes current = root;
        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(int id) {
        Nodes newNode = new Nodes();
        newNode.iData = id;
        if (root == null) {
            root = newNode;
        } else {
            Nodes current = root;
            Nodes parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int id) {
        Nodes current = root;
        Nodes parent = root;

        boolean isLeftChild = true;
        while (current.iData != id) {
            parent = current;
            if (id < current.iData) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }

        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.leftChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            Nodes successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            }

            successor.leftChild = current.leftChild;
        }
        return true;
    }

    private Nodes getSuccessor(Nodes delNode) {
        Nodes successorParent = delNode;
        Nodes successor = delNode;
        Nodes current = delNode.rightChild;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public Nodes minimum() {
        Nodes current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Nodes MAX() {
        Nodes current, last = null;
        current = root;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }
}