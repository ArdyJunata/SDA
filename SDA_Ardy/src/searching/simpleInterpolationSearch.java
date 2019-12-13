/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-316-28
 */
public class simpleInterpolationSearch {

    static int[] a = {3, 9, 11, 17, 25, 34, 31};

    public static void main(String[] args) {
        int posisi;
        int cari;

        cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka yang dicari : "));
        posisi = search(cari, a.length);

        if (posisi == -1) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!!");
        } else {
            JOptionPane.showMessageDialog(null, "Data ditemukan!!");
        }
    }

    public static int search(int b, int n) {
        int flag = 0;
        int awal = 0;
        int akhir = 0;
        int nt = 0;
        int pos = 0;
        akhir = n - 1;
        do {
            nt = (int) ((b - a[awal]) / (a[akhir]) * (akhir - awal) + awal);
            if (a[nt] == b) {
                return nt;
            } else if (b < a[nt]) {
                akhir = nt - 1;
            } else {
                awal = nt + 1;
            }
        } while (b >= a[awal] && b <= a[akhir]);
        return -1;
    }
    
    public int getSearch(int a[], int b) {
        int flag = 0;
        int awal = 0;
        int akhir = 0;
        int nt = 0;
        int pos = 0;
        akhir = a.length - 1;
        do {
            nt = (int) ((b - a[awal]) / (a[akhir]) * (akhir - awal) + awal);
            if (a[nt] == b) {
                return nt;
            } else if (b < a[nt]) {
                akhir = nt - 1;
            } else {
                awal = nt + 1;
            }
        } while (b >= a[awal] && b <= a[akhir]);
        return -1;
    }
}
