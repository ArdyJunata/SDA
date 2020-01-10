package LatihanTree;

public class Stck2 {
    private char[] a;
    private int    top, m;
 
    public Stck2(int max)
    {
        m = max;
        a = new char[m];
        top = -1;
    }
 
    public void push(char key)
    {
        a[++top] = key;
    }
 
    public char pop()
    {
        return (a[top--]);
    }
 
    public boolean isEmpty()
    {
        return (top == -1);
    } 
}
