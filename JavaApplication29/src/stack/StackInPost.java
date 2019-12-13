package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackInPost {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack stack = new Stack();
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                output += s.charAt(i);
            } else if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                while (stack.peek() == "(") {
                    output += stack.pop();
                }
                stack.pop();
            } else if (levelOperator(s.charAt(i)) > levelOperator((char) stack.peek())) {
                stack.push(s.charAt(i));
            } else {
                output += stack.pop();
                stack.push(s.charAt(i));
            }
        }

        while (!stack.isEmpty()) {
            output += stack.pop();
        }

        System.out.println("Infix : " + s);
        System.out.println("Postfix : " + output);
    }

    private static int levelOperator(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}
