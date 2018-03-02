package sort;

/**
 * Merge Sort
 */
public class Merge {
    private static int[] temp;

    public static void sort(int[] a) {
        if (a != null && a.length > 0) {
            temp = new int[a.length];
            mergeSort(a, 0, a.length - 1);
        }
    }

    private static void merge(int[] a, int low, int mid, int high) {
        System.arraycopy(a, 0, temp, 0, a.length);
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = temp[j++];
            } else if (j > high) {
                a[k] = temp[i++];
            } else if (temp[i] > temp[j]) {
                a[k] = temp[j++];
            } else {
                a[k] = temp[i++];
            }
        }
    }

    private static void mergeSort(int[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, mid, high);
    }
}
