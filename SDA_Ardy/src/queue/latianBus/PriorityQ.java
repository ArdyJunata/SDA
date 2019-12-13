package queue.latianBus;

public class PriorityQ {

    private int maxSize;
    private String[] queArray;
    private String[] status;
    private int nItems;
    private int front;

    public PriorityQ(int s) {
        maxSize = s;
        queArray = new String[maxSize];
        status = new String[maxSize];
        nItems = 0;
        front = 0;
    }

    private int prioritas(String status) {
        switch (status) {
            case "lansia":
                return 2;
            case "sakit":
                return 1;
            case "sehat":
                return 0;
            default:
                return -1;
        }
    }

    public void insert(String item, String stat) {
        int i;
        for (i = nItems - 1; i >= 0 && prioritas(stat) > prioritas(status[i]); i--) {
            queArray[i + 1] = queArray[i];
            status[i + 1] = status[i];
        }
        queArray[i + 1] = item;
        status[i + 1] = stat;
        nItems++;
    }

    public String remove() {
        String hasil = queArray[front] + " (" + status[front] + ")";
        if (++front == maxSize) {
            front = 0;
        }
        return hasil;
    }

    public String peekMin() {
        return queArray[nItems - 1];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}