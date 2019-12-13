package latihan;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SortAndSearch {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int angka[] = new int[5];

        System.out.println("Input Array Number : ");
        for (int i = 0; i < angka.length; i++) {
            angka[i] = inp.nextInt();
        }

        System.out.println("\nBefore Sorting :\n" + Arrays.toString(angka));
        sort(angka);
        System.out.println("After Sorting :\n" + Arrays.toString(angka));

        System.out.print("\nInput Search Number : ");
        int cari = inp.nextInt();
        search(angka, cari);
    }

    public static void sort(int angka[]) {
        int i, j, temp, awal;
        for (i = 0; i < (angka.length); i++) {
            awal = i;
            for (j = i + 1; j < angka.length; j++) {
                if (angka[awal] > angka[j]) {
                    awal = j;
                }
            }
            temp = angka[i];
            angka[i] = angka[awal];
            angka[awal] = temp;
        }
    }

    public static void search(int angka[], int cari) {
        int awal = 0;
        int akhir = 0;

        int nt = 0;
        int flag = 0;

        akhir = angka.length - 1;
        while (awal <= akhir && flag == 0) {
            nt = Math.abs((awal + akhir) / 2);
            if (angka[nt] == cari) {
                flag = 1;
            } else if (cari < angka[nt]) {
                akhir = nt - 1;
            } else {
                awal = nt + 1;
            }
        }
        System.out.println((flag == 1) ? "Data Found on index-" + nt + " !!" : "Data Not Found !!");
    }
}