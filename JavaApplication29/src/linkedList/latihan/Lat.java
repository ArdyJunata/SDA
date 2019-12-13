/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList.latihan;

import java.util.Scanner;

/**
 *
 * @author LAB-316-28
 */
public class Lat {

    public static void main(String[] args) {
        linkLat linkedlist = new linkLat();
        Scanner scans = new Scanner(System.in);
        System.out.print("1. Insert depan\n2. Insert belakang\n3. Hapus depan"
                + "\n4. Hapus belakang\n5. Tampil\n6. Exit\n");

        OUTER:

        for (int i = 0; i == i; i++) {
            System.out.print("Masukkan pilihan anda: ");
            int Link = Integer.parseInt(scans.nextLine());
            switch (Link) {
                case 1: {
                    System.out.print("Masukkan Nilai: ");
                    int nilai = Integer.parseInt(scans.nextLine());
                    linkedlist.insertDepan(nilai);
                    break;
                }
                case 2: {
                    System.out.print("Masukkan nilai: ");
                    int nilai = Integer.parseInt(scans.nextLine());
                    linkedlist.insertBelakang(nilai);
                    break;
                }
                case 3:

                    linkedlist.hapusDepan();
                    break;

                case 4:

                    linkedlist.hapusBelakang();
                    break;

                case 5:

                    linkedlist.printDepan();
                    System.out.println("");
                    break;

                case 6:
                    break OUTER;
                default:
                    break;
            }
        }
    }
}
