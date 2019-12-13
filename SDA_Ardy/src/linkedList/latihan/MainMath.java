package linkedList.latihan;

public class MainMath {

    public static void main(String[] args) {
        LinkMath link = new LinkMath();
        double hasil = 0;
        link.insertDepan(0, 0.45);
        link.insertBelakang(2, -1.89);
        link.insertBelakang(5, 3.4);
        link.insertBelakang(16, 9);
        link.printDepan();
        System.out.println("");
        hasil = link.hitung(2);
        System.out.println(hasil);
    }
}
