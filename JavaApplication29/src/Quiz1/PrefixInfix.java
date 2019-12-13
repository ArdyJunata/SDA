package Quiz1;

import java.util.Stack;
import java.util.Scanner;
import stack.*;

public class PrefixInfix {

    public static void main(String[] args) {
        char ch;
        char num1, num2;
        String output = "";
        
        Stack theStack = new Stack();
        
        Scanner in = new Scanner(System.in);

        String prefix = in.nextLine();

        for (int i = 0; i < prefix.length(); i++) {
            ch = prefix.charAt(i);
            if(isOperator(ch)) {
                output += ch;
                System.out.println("dah di simpan");
            } else {
                theStack.push(ch);
                System.out.println("dah di push");
            }
        }
        num1 = (char) theStack.pop();
        num2 = (char) theStack.pop();
        output = num1 + output + num2; 
        System.out.println("Infix = "+output);
    }
    
    public static boolean isOperator(char ch) {
        switch(ch) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return true;
        }
        return false;
    }
}
