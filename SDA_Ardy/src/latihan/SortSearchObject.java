package latihan;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SortSearchObject {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Pasien p[] = new Pasien[2];

        System.out.println("Input Data Pasien : ");
        for (int i = 0; i < p.length; i++) {
            String nama = inp.next();
            int umur = inp.nextInt();
            p[i] = new Pasien(nama, umur);
        }

        sort(p);

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
    }

    public static void sort(Pasien p[]) {
        Pasien temp;
        int i, j, awal;
        for (i = 0; i < (p.length); i++) {
            awal = i;
            for (j = i + 1; j < p.length; j++) {
                if (p[awal].getUmur() > p[j].getUmur()) {
                    awal = j;
                }
            }
            temp = p[i];
            p[i] = p[awal];
            p[awal] = temp;
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
