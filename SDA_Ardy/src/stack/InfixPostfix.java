package stack;

import java.util.Scanner;

public class InfixPostfix {

    static EvaluasiPostfix toEvaluate = new EvaluasiPostfix();
    static PostFix toPostfix = new PostFix();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai Infix : ");
        String input = in.nextLine();
        String postfix = toPostfix.getString(input);
        System.out.println("Nilai Postfix : " + postfix);
        System.out.println("");
        toEvaluate.getString(postfix);
    }
}
