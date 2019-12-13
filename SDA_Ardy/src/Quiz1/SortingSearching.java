package Quiz1;

import java.util.Scanner;
import sorting.*;
import searching.*;
import java.util.Arrays;

public class SortingSearching {

    static Bubble_Sort bubble = new Bubble_Sort();
    static Exchange_Sort exchange = new Exchange_Sort();
    static SelectionSort selection = new SelectionSort();
    static SimpleBinSearch bin = new SimpleBinSearch();
    static simpleInterpolationSearch inter = new simpleInterpolationSearch();
    static SimpleSequentialSearch sequ = new SimpleSequentialSearch();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        String nilai = in.nextLine();
        String urut[] = nilai.split(" ");

        int nilaiInt[] = new int[urut.length];
        for (int i = 0; i < urut.length; i++) {
            nilaiInt[i] = Integer.parseInt(urut[i]);
        }

        System.out.println("\n1. Bubble Sort\n2. Exchange Sort\n3. Selection Sort");
        System.out.print("Pilih Jenis Sorting yang diinginkan : ");
        int pil = in.nextInt();
        if (pil == 1) {
            nilaiInt = bubble.getSort(nilaiInt);
            System.out.println(Arrays.toString(nilaiInt));
        } else if (pil == 2) {
            nilaiInt = exchange.getSort(nilaiInt);
            System.out.println(Arrays.toString(nilaiInt));
        } else if (pil == 3) {
            nilaiInt = selection.getSort(nilaiInt);
            System.out.println(Arrays.toString(nilaiInt));
        } else {
            System.out.println("Pilihan tidak ada.");
        }

        System.out.println("\n1. Binary Search\n2. Interpolitan Search\n3. Sequential Search");
        System.out.print("Pilih Jenis Searching yang diinginkan : ");
        int pil1 = in.nextInt();
        System.out.print("Masukkan angka yang ingin di cari : ");
        int cari = in.nextInt();
        if (pil1 == 1) {
            bin.getSearch(nilaiInt, cari);
        } else if (pil1 == 2) {
            int posisi = inter.getSearch(nilaiInt, cari);
            if (posisi == -1) {
                System.out.println("Data tidak ditemukan !!");
            } else {
                System.out.println("Data ditemukan!!");
            }
        } else if (pil1 == 3) {
                sequ.getSearch(nilaiInt, cari);
        } else {
            System.out.println("Pilihan tidak ada.");
        }
    }
}
