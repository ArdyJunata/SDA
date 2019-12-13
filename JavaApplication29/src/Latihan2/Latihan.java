/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

import java.util.Scanner;

/**
 *
 * @author LAB-316-25
 */
public class Latihan {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       PriorityQ queue = new PriorityQ(5);
       String arr[] ;
       
       System.out.println("Waiting");
       for (int i = 0; i < 5; i++) {
           System.out.print("- ");
           String s = input.nextLine();
           arr = s.split(" ");
           queue.insert(arr[0],arr[1]);
       }
       System.out.println("Boarding");
       for (int i = 0; i < 5; i++) {
           System.out.print("Nama = ");
           String out = queue.remove();
           System.out.println(out);
       }
   }
}


