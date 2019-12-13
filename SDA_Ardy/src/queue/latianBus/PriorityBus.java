package queue.latianBus;

import java.util.Scanner;

public class PriorityBus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQ queue = new PriorityQ(5);
        String arr[];

        System.out.println("Waiting");
        for (int i = 0; i < 5; i++) {
            System.out.print("- ");
            String s = input.nextLine();
            arr = s.split(" ");
            queue.insert(arr[0], arr[1]);
        }
        System.out.println("Boarding");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nama = ");
            String out = queue.remove();
            System.out.println(out);
        }
    }
}