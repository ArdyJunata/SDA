/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursif;

import java.util.Scanner;

public class LatihanBarisBintang {

    static int baris;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Baris : ");
        baris = input.nextInt();
        cetakPiramid(0);
    }
    
    public static void cetakPiramid(int i) {
        cetakSpasi(0, i);
        cetakBintang(baris, i);
        System.out.println("");
        if(++i < baris) {
            cetakPiramid(i);
        }
    }

    public static void cetakSpasi(int j, int i) {
        if (j < baris - i - 1) {
            System.out.print("_");
            cetakSpasi(j + 1, i);
        }
    }
    
    public static void cetakBintang(int j, int i) {
        if (j > baris - i - 1) {
            System.out.print("* ");
            cetakBintang(j - 1, i);
        }
    }
}
