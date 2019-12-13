package linkedList.latihan;

import javax.swing.JOptionPane;

public class Buku {

    public static void main(String[] args) {
        String kondisi = null, buku = null, genre = null;
        int harga = 0, pilihan = 0;
        boolean ulang = true;
        LinkBuku link = new LinkBuku();
        link.insertBelakang("SCM", 200000, "Non-Fiksi");
        link.insertBelakang("Python", 300000, "Non-Fiksi");
        link.insertBelakang("OnePiece", 2500, "Fiksi");
        do {
            pilihan = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1. Masukkan data\n2. "
                    + "Masukkan data dengan kondisi\n3. Hapus data dengan kondisi"
                    + "\n4. Tampil Data \n5. Cari Data\n6. Selesai "));
            switch (pilihan) {
                case 1:
                    buku = JOptionPane.showInputDialog("Masukkan judul :");
                    harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan harga"));
                    genre = JOptionPane.showInputDialog("Masukkan genre :");
                    link.insertBelakang(buku, harga, genre);
                    break;
                case 2:
                    buku = JOptionPane.showInputDialog("Masukkan judul :");
                    harga = Integer.parseInt(JOptionPane.showInputDialog("Masukkan harga"));
                    genre = JOptionPane.showInputDialog("Masukkan genre :");
                    kondisi = JOptionPane.showInputDialog("Masukkan data setelah judul : ");
                    link.insertKondisi(kondisi, buku, harga, genre);
                    break;
                case 3:
                    kondisi = JOptionPane.showInputDialog("Masukkan judul buku yang ingin dihapus : ");
                    link.hapusKondisi(kondisi);
                    break;
                case 4:
                    link.printDepan();
                    System.out.println("=========================================");
                    break;
                case 5:
                    kondisi = JOptionPane.showInputDialog("Masukkan judu yang ingin dicari : ");
                    JOptionPane.showMessageDialog(null, "Buku " + kondisi + " " + link.cariData(kondisi));
                    break;
                case 6:
                    ulang = false;
                    break;
                default:
                    ulang = true;
            }
        } while (ulang);
    }
}
