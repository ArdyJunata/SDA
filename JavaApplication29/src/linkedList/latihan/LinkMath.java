package linkedList.latihan;

public class LinkMath {

    LinkMath next, head, bantu;
    int pangkat;
    double nilai;

    public LinkMath() {
    }

    public LinkMath(int pangkat, double nilai) {
        this.pangkat = pangkat;
        this.nilai = nilai;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertDepan(int pangkat, double nilai) {
        LinkMath baru;
        baru = new LinkMath(pangkat, nilai);
        baru.next = baru;
        if (isEmpty() == true) {
            head = baru;
            head.next = null;
        } else {
            baru.next = head;
            head = baru;
        }
    }

    public void insertBelakang(int pangkat, double nilai) {
        LinkMath baru;
        LinkMath temp = head;
        baru = new LinkMath(pangkat, nilai);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = baru;
        temp.next.next = null;

    }

    public double hitung(int x) {
        double jumlah = 0;
        bantu = head;

        while (bantu != null) {
            double hitung = bantu.nilai * Math.pow(x, bantu.pangkat);
            jumlah += hitung;
            bantu = bantu.next;
        }
        return jumlah;
    }

    public void printDepan() {
        if (isEmpty() == false) {
            bantu = head;
            while (bantu != null) {
                bantu.displaynode();
                bantu = bantu.next;
            }
        }
    }

    public void displaynode() {
        System.out.println(pangkat + ", " + nilai);
    }
}