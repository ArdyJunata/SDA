package sorting;

public class Exchange_Sort {

    public static void main(String[] args) {
        int[] array = {1, 5, 9, 8, 3, 2, 4, 7, 10, 6};
        int i, j, temp;
        int arrayLength = array.length;
        for (i = 0; i < arrayLength; i++) {
            for (j = (i + 1); j < arrayLength; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }
    
    public int[] getSort(int array[]) {
        int i, j, temp;
        int arrayLength = array.length;
        for (i = 0; i < arrayLength; i++) {
            for (j = (i + 1); j < arrayLength; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
