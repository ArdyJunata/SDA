package LatihanTree;

import java.io.DataInputStream;
import java.io.IOException;

public class Konv {

    public static void main(String args[]) throws IOException {
        String ch = "y";
        DataInputStream inp = new DataInputStream(System.in);
        while (ch.equals("y")) {
            Tree t1 = new Tree();
            System.out.println("Masukkan angka ");
            String a = inp.readLine();
            t1.insert(a);
            t1.traverse("pre");
            System.out.println("");
            t1.traverse("in");
            System.out.println("");
            t1.traverse("post");
            System.out.println("");
            t1.traverse("jumlah");
            System.out.println("");
            System.out.print("ingin melanjutkan?[y/n]  ");
            ch = inp.readLine();

        }
    }
}
