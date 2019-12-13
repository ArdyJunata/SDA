package searching;

import javax.swing.JOptionPane;

public class SimpleBinSearch {

    public static void main(String[] args) {
        int c[] = {3, 5, 7, 9, 11, 17, 33};
        int awal = 0;
        int akhir = 0;

        int nt = 0;
        int flag = 0;
        int cari;

        cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang dicari: "));

        akhir = c.length - 1;
        while (awal <= akhir && flag == 0) {
            nt = Math.abs((awal + akhir) / 2);
            if (c[nt] == cari) {
                flag = 1;
            } else if (cari < c[nt]) {
                akhir = nt - 1;
            } else {
                awal = nt + 1;
            }
        }

        JOptionPane.showMessageDialog(null, (flag == 1) ? "Data ditemukan !!" : "Data tidak ditemukan !!");

        System.exit(0);
    }
    
    public void getSearch(int c[], int cari) {
        int awal = 0;
        int akhir = 0;

        int nt = 0;
        int flag = 0;

        akhir = c.length - 1;
        while (awal <= akhir && flag == 0) {
            nt = Math.abs((awal + akhir) / 2);
            if (c[nt] == cari) {
                flag = 1;
            } else if (cari < c[nt]) {
                akhir = nt - 1;
            } else {
                awal = nt + 1;
            }
        }

       System.out.println((flag == 1) ? "Data ditemukan !!" : "Data tidak ditemukan !!");
    }
}
