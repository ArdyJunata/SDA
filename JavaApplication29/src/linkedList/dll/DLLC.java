package linkedList.dll;

public class DLLC {

    link head, bantu, hapus;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertDepan(int databaru) {
        link baru = new link(databaru);
        baru.next = baru.previous = null;
        if (isEmpty()) {
            head = baru;
            head.next = head;
            head.previous = head;
        } else {
            bantu = head.previous;
            head.previous = baru;
            baru.next = head;
            head = baru;
            bantu.next = head;
            head.previous = bantu;
        }
    }

    public void insertBelakang(int databaru) {
        link baru = new link(databaru);
        baru.next = baru.previous = null;
        if (isEmpty()) {
            head = baru;
            head.next = head;
            head.previous = head;
        } else {
            bantu = head;
            while (bantu.next != head) {
                bantu = bantu.next;
            }
            bantu.next = baru;
            baru.previous = bantu;
            baru.next = head;
            head.previous = baru;
        }
    }

    public void hapusDepan() {
        if (head.next != head) {
            bantu = head.previous;
            head = head.next;
            bantu.next = head;
            head.previous = bantu;
        } else {
            head = null;
        }
    }

    public void hapusBelakang() {
        if (head.next != head) {
            bantu = head;
            while (bantu.next.next != head) {
                bantu = bantu.next;
            }
            hapus = bantu.next;
            hapus.previous = null;
            hapus.next = null;
            bantu.next = head;
            head.previous = bantu;
        } else {
            head = null;
        }
    }

    public void printDepan() {
        if (!isEmpty()) {
            bantu = head;
            do {
                bantu.displaynode();
                bantu = bantu.next;
            } while (bantu != head);
        }
    }

    public void printBelakang() {
        link bantu2;
        if (!isEmpty()) {
            bantu = head;
            while (bantu.next != head) {
                bantu = bantu.next;
            }
            bantu2 = bantu;
            do {
                bantu2.displaynode();
                bantu2 = bantu2.previous;
            } while (bantu2.previous != bantu);
            bantu2.displaynode();
        }
    }

    public static void main(String[] args) {
        DLLC list = new DLLC();
        list.insertDepan(5);
        list.insertDepan(2);
        list.insertDepan(7);
        list.insertBelakang(9);
        list.printDepan();
        System.out.println();

        list.insertDepan(6);
        list.printBelakang();
        list.hapusDepan();
        System.out.println();

        list.printDepan();
        list.hapusBelakang();
        System.out.println();

        list.printDepan();
        System.out.println();
    }
}
