package stack;

import java.util.Scanner;
import java.util.Stack;

public class BrowsingStack {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        Stack theStack = new Stack();
        
        System.out.println("Browsing");

        for (int i = 0; i < 3; i++) {
            System.out.print("Website " + (i + 1) + " : ");
            String browse = inp.nextLine();
            theStack.push(browse);
        }
        System.out.println("\nSekarang anda ada di " + theStack.pop());
        for (int i = 0; i < 3; i++) {
            if (theStack.isEmpty()) {
                return;
            } else {
                System.out.print("Back ? : ");
                String opsi = inp.nextLine();
                if (opsi.equals("B")) {
                    System.out.println("\nSekarang anda ada di " + theStack.pop());
                }
            }
        }

    }
}
