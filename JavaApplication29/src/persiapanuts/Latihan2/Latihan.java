package queu.Latihan2;

import java.util.Date;
import java.util.Scanner;

public class Latihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQ queue = new PriorityQ(5);
        String arr[];
        Date date = new Date();

        System.out.println("Waiting");
        for (int i = 0; i < 5; i++) {
            System.out.print("- ");
            String s = input.nextLine();
            long waktu = date.getTime();
            arr = s.split(" ");
            queue.insert(arr[0], arr[1], waktu);
        }
        System.out.println("Boarding");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nama = ");
            String out = queue.remove();
            System.out.println(out);
        }
    }
}
