package linkedList.dll;

public class dLink {

    public int data;
    public dLink next;
    public dLink previous;
    dLink head;
    dLink bantu;

    public dLink() {

    }

    public dLink(int d) {
        data = d;
        next = null;
        previous = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void insertDepan(int databaru) {
        dLink baru;
        baru = new dLink(databaru);
        baru.next = null;
        baru.previous = null;
        if (isEmpty() == true) {
            head = baru;
            head.next = null;
            head.previous = null;
        } else {
            head.previous = baru;
            baru.next = head;
            head = baru;
        }
    }

    public void insertBelakang(int databaru) {
        dLink baru;
        baru = new dLink(databaru);
        baru.next = null;
        baru.previous = null;
        if (isEmpty() == true) {
            head = baru;
            head.next = null;
            head.previous = null;
        } else {
            bantu = head;
            while (bantu.next != null) {
                bantu = bantu.next;
            }
            bantu.next = baru;
            baru.next = null;
            baru.previous = bantu;
        }
    }

    public void hapusDepan() {
        dLink hapus;
        hapus = head;
        if (head.next != null) {
            head = head.next;
            head.previous = null;
            hapus = null;
        }
    }

    public void hapusBelakang() {
        dLink hapus = new dLink();
        bantu = head;
        while (bantu.next.next != null) {
            bantu = bantu.next;
        }
        hapus = bantu.next;
        hapus.previous = null;
        bantu.next = null;
        
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

    public void printBelakang() {
        dLink bantu2;
        if (isEmpty() == false) {
            bantu = head;
            while (bantu.next != null) {
                bantu = bantu.next;
            }
            bantu2 = bantu;
            while (bantu2 != null) {
                bantu2.displaynode();
                bantu2 = bantu2.previous;
            }
        }
    }

    public void displaynode() {
        System.out.print(data + " ");
    }
}
