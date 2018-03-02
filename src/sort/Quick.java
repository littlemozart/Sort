package sort;

/**
 * Quick Sort
 */
public class Quick {
    public static void sort(int[] a) {
        if (a != null && a.length > 2) {
            quickSort(a, 0, a.length - 1);
        }
    }

    private static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            quickSort(a, low, p - 1);
            quickSort(a, p + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int ref = a[low];
        while (low < high) {
            while (low < high && a[high] >= ref) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= ref) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = ref;
        return low;
    }
}
