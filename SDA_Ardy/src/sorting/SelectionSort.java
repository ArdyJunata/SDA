package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] angka = {1, 9, 5, 4, 6, 3, 8, 2, 7, 10};
        int i, j, temp, awal;
        for (i = 0; i < (angka.length); i++) {
            awal = i;
            for (j = i + 1; j < angka.length; j++) {
                if (angka[awal] > angka[j]) {
                    awal = j;
                }
            }
            temp = angka[i];
            angka[i] = angka[awal];
            angka[awal] = temp;
            System.out.println(angka[i]);
        }
    }
    
    public int[] getSort(int angka[]) {
        int i, j, temp, awal;
        for (i = 0; i < (angka.length); i++) {
            awal = i;
            for (j = i + 1; j < angka.length; j++) {
                if (angka[awal] > angka[j]) {
                    awal = j;
                }
            }
            temp = angka[i];
            angka[i] = angka[awal];
            angka[awal] = temp;
        }
        return angka;
    }
}
