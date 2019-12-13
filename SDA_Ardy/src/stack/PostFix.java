package stack;

import java.util.Scanner;
import java.util.Stack;

public class PostFix {

    static Stack s = new Stack();
    static String postfix = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String infix = in.nextLine();
        char[] n = infix.toCharArray();

        for (int i = 0; i < n.length; i++) {
            switch (n[i]) {
                case '+':
                case '-':
                    operPush(n[i], 1);
                    break;
                case '*':
                case '/':
                    operPush(n[i], 2);
                    break;
                case '(':
                    s.push(n[i]);
                    break;
                case ')':
                    tutup(n[i]);
                    break;
                default:
                    postfix += n[i];
                    break;
            }
        }
        while (!s.isEmpty()) {
            postfix += s.pop();
        }
        System.out.println("Infix : " + infix);
        System.out.println("Postfix : " + postfix);
    }

    public String getString(String infix) {
        char[] n = infix.toCharArray();

        for (int i = 0; i < n.length; i++) {
            switch (n[i]) {
                case '+':
                case '-':
                    operPush(n[i], 1);
                    break;
                case '*':
                case '/':
                    operPush(n[i], 2);
                    break;
                case '(':
                    s.push(n[i]);
                    break;
                case ')':
                    tutup(n[i]);
                    break;
                default:
                    postfix += n[i];
                    break;
            }
        }
        while (!s.isEmpty()) {
            postfix += s.pop();
        }
        return postfix;
    }

    private static void operPush(char c, int prio1) {
        while (!s.isEmpty()) {
            char top = (char) s.pop();
            if (top == '(') {
                s.push(top);
                break;
            } else {
                int prio2;
                if (top == '+' || top == '-') {
                    prio2 = 1;
                } else {
                    prio2 = 2;
                }
                if (prio2 < prio1) {
                    s.push(top);
                    break;
                } else {
                    postfix += top;
                }
            }
        }
        s.push(c);
    }

    private static void tutup(char c) {
        while (!s.isEmpty()) {
            char n = (char) s.pop();
            if (n == '(') {
                break;
            } else {
                postfix += n;
            }
        }
    }
}
