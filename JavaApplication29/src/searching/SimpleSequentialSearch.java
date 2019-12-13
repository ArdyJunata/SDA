package searching;

import javax.swing.JOptionPane;

public class SimpleSequentialSearch {

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 4, 8, 3, 6, 2};
        int flag = 0;

        int j = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Angka yang Dicari: "));
        for (int i = 0; i < a.length; i++) {

            flag = (j == a[i]) ? 1 : 0;

            if (j == a[i]) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }

        System.out.println((flag == 1) ? "Data yang dicari: " + j + " ada" : "Data yang dicari: " + j + " tidak ada");

    }

    public void getSearch(int a[], int j) {
        int flag = 0;
        
        for (int i = 0; i < a.length; i++) {

            flag = (j == a[i]) ? 1 : 0;

            if (j == a[i]) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
        }

        System.out.println((flag == 1) ? "Data ditemukan" : "Data tidak ditemukan");
    }
}
