/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList.latihan;

/**
 *
 * @author LAB-316-28
 */
public class linkLat {
     public int data;
    public linkLat next;

    public linkLat() {

    }

    public linkLat(int d) {
        data = d;
        next = null;
    }
    linkLat head;
    linkLat bantu;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }

    }

    public void insertDepan(int databaru) {
        linkLat baru;
        baru = new linkLat(databaru);
        baru.next = baru;

        if (isEmpty() == true) {
            head = baru;
            head.next = head;
        } else if (head.next == head) {
            baru.next = head;
            head.next = baru;
            head = baru;
        } else {
            bantu = head;
            while (bantu.next != head) {
                bantu = bantu.next;
            }
            bantu.next = baru;
            baru.next = head;
            head = baru;
        }
    }

    public void insertBelakang(int databaru) {
        linkLat baru;
        linkLat temp = head;
        baru = new linkLat(databaru);
        while (temp.next !=head) {
            temp = temp.next;
        }
        temp.next = baru;
        temp.next.next = head;

    }

    public void hapusDepan() {
        if (head.next == head) {
            head = null;
        } else {
            bantu = head;
            while (bantu.next != head) {
                bantu = bantu.next;
            }
            head = head.next;
            bantu.next = head;
        }
    }

    public void hapusBelakang() {
        linkLat temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next=head;
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

    public void displaynode() {
        System.out.print(data + " ");
    }
}


