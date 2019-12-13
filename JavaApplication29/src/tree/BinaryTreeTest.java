/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LAB-316-28
 */
public class BinaryTreeTest {
    private static int cari;
    private static int cacahData;
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        System.out.print("Berapa data yang akan dimasukkan ke Binary Tree ? ");
        cacahData = inputData();
        for (int i = 0; i < cacahData; i++) {
            System.out.print("Data ke- "+(i+1)+" = ");
            bt.insert(inputData());
        }
        System.out.print("Data yang anda cari ? ");
        cari = inputData();
        Nodes found = (Nodes) bt.find(cari);
        if (found != null) {
            System.out.print("Node dengan key " + cari + " ditemukan");
        }
    }
    
    private static int inputData() {
        BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in));
        String angkaInput = null;
        try {
            angkaInput = bfr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int Data = Integer.valueOf(angkaInput).intValue();
        return Data;
    }
}
