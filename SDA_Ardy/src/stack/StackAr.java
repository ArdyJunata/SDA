package stack;

public class StackAr {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackAr(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }
    
    public char pop() {
        return stackArray[top--];
    }

    public double peek() {
        return stackArray[top];
    }

    public boolean isEmpety() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }

    public char peekN(int n) {
        return stackArray[n];
    }

    public void displayStack(String s) {
        System.out.println(s);
        System.out.println("Stack (botttom-->top : ");
        for (int j = 1;  j < size(); j++) {
            System.out.println(peekN(j));
            System.out.println(" ");
        }
        System.out.println("");
    }
    
    public void tampilStack() {
        while (!isEmpety()) {
            char value = pop();
            System.out.println(value);
            System.out.println(" ");
        }
    }
}
