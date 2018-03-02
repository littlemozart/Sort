package sort;

/**
 * Selection Sort
 */
public class Selection {
    public static void sort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }
        for (int i = 0; i < a.length - 1; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[p] > a[j]) {
                    p = j;
                }
            }
            if (p != i) {
                int temp = a[i];
                a[i] = a[p];
                a[p] = temp;
            }
        }
    }
}
