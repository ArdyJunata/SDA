/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursif;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-316-28
 */

public class rekursifFibonacci {

    public static void main(String[] args) {
        int bil;
        bil = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Derete : "));

        for (int i = 0; i < bil; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n) {
        return (n == 0 || n == 1) ? n : fibo(n - 1) + fibo(n - 2);
    }
}
