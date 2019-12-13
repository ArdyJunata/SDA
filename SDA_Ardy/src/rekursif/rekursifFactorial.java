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
public class rekursifFactorial {

    public static void main(String[] args) {
        int bil;
        int fak = 1;

        bil = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan yang akan di faktorkan : "));

        fak = faktorial(bil);

        JOptionPane.showMessageDialog(null, " " + bil + "! = " + fak);
    }

    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}
