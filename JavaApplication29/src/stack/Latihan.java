/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author LAB-316-28
 */
public class Latihan {

    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Website %d : ", i + 1);
            s.push(in.nextLine());
        }

        while (true) {
            if (s.isEmpty()) {
                return;
            }

            System.out.printf("Sekarang anda ada di %s \n", s.peek());
            System.out.print("Back ? : ");
            
            if (in.nextLine().equalsIgnoreCase("B")) {
                s.pop();
            } else {
                return;
            }

        }
    }
}
