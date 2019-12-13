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
public class SLLC {

    public static void main(String[] args) {
        linkSLLC linkedlist = new linkSLLC();
        linkedlist.insertDepan(5);
        linkedlist.insertDepan(2);
        linkedlist.insertDepan(7);
        linkedlist.insertBelakang(9);

        linkedlist.printDepan();
        System.out.println();
        linkedlist.insertDepan(6);
        System.out.println();
        linkedlist.printDepan();
        linkedlist.hapusDepan();
        System.out.println();
        linkedlist.printDepan();
        linkedlist.hapusBelakang();
        System.out.println();
        linkedlist.printDepan();
        linkedlist.insertBelakang(4);
        System.out.println();
        linkedlist.printDepan();
        System.out.println();
    }
}
