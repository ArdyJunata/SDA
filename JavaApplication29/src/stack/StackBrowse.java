package stack;

public class StackBrowse {

    int maxSize;
    String[] stackArray;
    int top;

    StackBrowse(int s) {
        maxSize = s;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String p) {
        stackArray[++top] = p;
    }

    public String pop() {
        return stackArray[top--];
    }

    public String peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void tampilStack() {
        while (!isEmpty()) {
            String value = pop();
            System.out.print(value);
            System.out.print(" ");
        }
    }

    public String backStack() {
        return pop();
    }
}
