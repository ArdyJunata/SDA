package stack;

public class StackArApp {
    public static void main(String[] args) {
        StackAr theStack = new StackAr(10);
        theStack.push('p');
        theStack.push('b');
        theStack.push('6');
        theStack.push('0');
        
        System.out.println("");
        theStack.tampilStack();
    }
}
