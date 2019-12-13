package rekursif;

import javax.swing.JOptionPane;

public class IteratifFactorial {

    public static void main(String[] args) {
        int bil;
        int fak = 1;

        bil = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan yang akan di faktorkan : "));

        for (int i = 1; i < bil; i++) {
            fak = fak * i;
        }

        JOptionPane.showMessageDialog(null, " " + bil + "! = " + fak);
    }
}
