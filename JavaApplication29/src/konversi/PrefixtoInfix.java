package konversi;

import java.util.*;

public class PrefixtoInfix {

    static boolean isOperator(char x) {
        if(x == '*' || x == '+' || x == '-' || x =='/')
            return true;
        return false;
    }

    static String getInfix(String exp) {
        Stack<String> s = new Stack<String>();
        
        int length = exp.length();
        
        for (int i = length - 1; i >= 0; i--) { 
            if (isOperator(exp.charAt(i))) {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                s.push("(" + op1 + exp.charAt(i)
                        + op2 + ")");
            }
            else {
                s.push(exp.charAt(i) + "");
            }
        } 
        return s.peek();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        System.out.println(getInfix(exp));
    }
} 
