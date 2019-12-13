/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 *
 * @author LAB-316-28
 */
public class linkSLLC {

    public int data;
    public linkSLLC next;

    public linkSLLC() {

    }

    public linkSLLC(int d) {
        data = d;
        next = null;
    }
    linkSLLC head;
    linkSLLC bantu;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }

    }

    public void insertDepan(int databaru) {
        linkSLLC baru;
        baru = new linkSLLC(databaru);
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
        linkSLLC baru;
        linkSLLC temp = head;
        baru = new linkSLLC(databaru);
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
        linkSLLC temp = head;
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
