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
public class Node {
    public int iData;
    public float fData;
    public Node leftChild;
    public Node rightChild;
    
    public Node(int id, float fd) {
        iData = id;
        fData = fd;
        leftChild = null;
        rightChild = null;
    }
    
    public void displayNode() {
        System.out.println(iData+", "+fData);
    }
}
