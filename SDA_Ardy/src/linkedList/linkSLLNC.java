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
public class linkSLLNC {

    public int data;
    public linkSLLNC next;

    public linkSLLNC() {

    }

    public linkSLLNC(int d) {
        data = d;
        next = null;
    }
    linkSLLNC head;
    linkSLLNC bantu;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertDepan(int databaru) {
        linkSLLNC baru;
        baru = new linkSLLNC(databaru);
        baru.next = baru;
        if (isEmpty() == true) {
            head = baru;
            head.next = null;
        } else {
            baru.next = head;
            head = baru;
        }
    }

    public void hapusDepan() {
        linkSLLNC hapus;
        if (head.next == null) {

        } else {
            hapus = head;
            head = head.next;
            hapus = null;
        }
    }

    public void insertBelakang(int databaru) {
        linkSLLNC baru;
        linkSLLNC temp = head;
        baru = new linkSLLNC(databaru);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = baru;
        temp.next.next = null;

    }

    public void hapusBelakang() {
        linkSLLNC hapus;
        if (head.next == null) {

        } else {
            hapus = head;
            head = head.next;
            hapus = null;
        }
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
        System.out.print(data + " ");
    }
}
