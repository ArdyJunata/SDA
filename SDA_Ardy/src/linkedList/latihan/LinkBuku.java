package linkedList.latihan;

public class LinkBuku {

    private String buku;
    private int harga;
    private String genre;
    private LinkBuku head, next, previous, bantu, hapus, bantu2;

    public LinkBuku() {

    }

    public LinkBuku(String buku, int harga, String genre) {
        this.buku = buku;
        this.harga = harga;
        this.genre = genre;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void insertDepan(String buku, int harga, String genre) {
        LinkBuku baru = new LinkBuku(buku, harga, genre);
        if (isEmpty()) {
            head = baru;
            head.next = head;
            head.previous = head;
        } else if (head.next == head) {
            baru.next = head;
            head.next = baru;
            head = baru;
        } else {
            head.next = bantu;
            bantu.previous = baru;
            baru.next = bantu;
            baru.previous = head;
            head.next = baru;
            head = baru;
        }
    }

    public void insertKondisi(String kondisi, String buku, int harga, String genre) {
        LinkBuku baru = new LinkBuku(buku, harga, genre);
        bantu = head;
        while (!bantu.buku.equalsIgnoreCase(kondisi)) {
            bantu = bantu.next;
        }
        bantu2 = bantu.next;
        bantu.next = baru;
        baru.next = bantu2;
        baru.previous = bantu;
        bantu2.previous = baru;
    }

    public void insertBelakang(String buku, int harga, String genre) {
        LinkBuku baru = new LinkBuku(buku, harga, genre);
        if (isEmpty()) {
            head = baru;
            head.next = head;
            head.previous = head;
        } else {
            bantu = head.next;
            bantu.next = baru;
            baru.previous = bantu;
            baru.next = head;
            head.previous = baru;
        }
    }

    public void printDepan() {
        if (isEmpty() == false) {
            bantu = head;
            do {
                bantu.displaynode();
                bantu = bantu.next;
            } while (bantu != head);
        }
    }

    public void hapusKondisi(String kondisi) {
        if (head.next != head) {
            hapus = head;
            while (!hapus.buku.equalsIgnoreCase(kondisi)) {
                hapus = hapus.next;
            }
            if (hapus.next != head) {
                hapus.previous = bantu;
                bantu.next = head;
                head.previous = bantu;
                hapus = null;
            } else {
                hapus.next = bantu2;
                hapus.previous = bantu;
                bantu.next = bantu2;
                bantu2.previous = bantu;
                hapus = null;
            }
        } else {
            head = null;
        }
    }

    public String cariData(String key) {
        bantu = head;
        while (bantu.buku.equalsIgnoreCase(key)) {
            return "Ada";
        }
        return "Tidak Ada";
    }

    public void displaynode() {
        System.out.println(this.buku + " " + this.harga + " " + this.genre);
    }
}
