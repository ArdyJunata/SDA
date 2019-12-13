package sorting;

public class Bubble_Sort {

    public static void main(String[] args) {
        String[] arr = {"now", "is", "the", "time", "flower", "all"};
        String temp;
        for (int i = 0; i < (arr.length); i++) {
            for (int j = (arr.length - 1); j > i; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            System.out.println(arr[i]);
        }

//        for (String string : arr) {
//            System.out.println(string);
//        }
    }

    public int[] getSort(int arr[]) {
        int temp;
        for (int i = 0; i < (arr.length); i++) {
            for (int j = (arr.length - 1); j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
