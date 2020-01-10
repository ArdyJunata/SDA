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
public class Tree {

    private static Node root;

    public Tree() {
        root = null;
    }

    public boolean lookup(int data) {
        return (lookup(root, data));
    }

    private boolean lookup(Node find, int data) {
        if (find == null) {
            return false;
        }
        if (data == find.iData) {
            return true;
        } else if (data < find.iData) {
            return (lookup(find.leftChild, data));
        } else {
            return (lookup(find.rightChild, data));
        }
    }

    public int finMin(Node tes) {
        Node min = tes;
        while (min.leftChild != null) {
            min = min.leftChild;
        }
        return min.iData;
    }

    public int finMin() {
        return (finMin(root));
    }

    public int finMax(Node tes) {
        Node max = tes;
        while (max.rightChild != null) {
            max = max.rightChild;
        }
        return max.iData;
    }

    public int finMax() {
        return (finMax(root));
    }

    public int size() {
        return (size(root));
    }

    private int size(Node node) {
        if (node == null) {
            return (0);
        } else {
            return (size(node.leftChild) + 1 + size(node.rightChild));
        }
    }

    public void insert(int id, float fd) {
        Node baru = new Node(id, fd);
        if (root == null) {
            System.out.println("Node baru " + id + " sebagai root");
            root = baru;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        System.out.println("Insert " + id 
                                + " sebagai anak kiri dari " + parent.iData);
                        parent.leftChild = baru;
                        break;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        System.out.println("Insert " + id 
                                + " sebagai anak kanan dari " + parent.iData);
                        parent.rightChild = baru;
                        break;
                    }
                }
            }
        }
    }

    public void printTree() {
        printTree(root);
        System.out.println("");
    }

    public void printTree(Node localroot) {
        if (localroot != null) {
            printTree(localroot.leftChild);
            localroot.displayNode();
            printTree(localroot.rightChild);
        }
    }

    public void InOrder() {
        InOrder(root);
        System.out.println("");
    }

    public void InOrder(Node localroot) {
        if (localroot != null) {
            InOrder(localroot.leftChild);
            localroot.displayNode();
            InOrder(localroot.rightChild);
        }
    }

    public void PostOrder() {
        PostOrder(root);
        System.out.println("");
    }

    public void PostOrder(Node localroot) {
        if (localroot != null) {
            PostOrder(localroot.leftChild);
            PostOrder(localroot.rightChild);
            localroot.displayNode();
        }
    }

    public void PreOrder() {
        PreOrder(root);
        System.out.println("");
    }

    public void PreOrder(Node localroot) {
        if (localroot != null) {
            localroot.displayNode();
            PreOrder(localroot.leftChild);
            PreOrder(localroot.rightChild);
        }
    }

    public static void main(String[] args) {
        Tree pohon = new Tree();
        pohon.insert(12, 3);
        pohon.insert(10, 3);
        pohon.insert(15, 3);
        pohon.insert(5, 3);
        pohon.insert(17, 3);
        System.out.println("Print InOrder");
        pohon.InOrder();
        System.out.println("Print PostOrder");
        pohon.PostOrder();
        System.out.println("Print PreOrder");
        pohon.PreOrder();

        boolean tampung = pohon.lookup(12);
        if (tampung == true) {
            System.out.println("Ketemu");
        } else {
            System.out.println("Tidak Ketemu");
        }
        int nilaimin = pohon.finMin();
        System.out.println("nilai minimun = " + nilaimin);

        int nilaimax = pohon.finMax();
        System.out.println("nilai maksimum = " + nilaimax);
        int count = pohon.size();
        System.out.println("jumlah node " + count);
    }
}
