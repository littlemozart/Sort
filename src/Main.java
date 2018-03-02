import sort.Insertion;
import sort.Merge;
import sort.Quick;
import sort.Selection;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[10000];
        int[] arr4 = new int[10000];
        for (int i = 0; i < 10000; i++) {
            int num = (int) (Math.random() * 10000);
            arr1[i] = num;
            arr2[i] = num;
            arr3[i] = num;
            arr4[i] = num;
        }
        Insertion.sort(arr1);
        Selection.sort(arr2);
        Merge.sort(arr3);
        Quick.sort(arr4);
        print(arr1);
        print(arr2);
        print(arr3);
        print(arr4);
    }

    private static void print(int[] a) {
        if (a == null) {
            System.out.println("null");
        } else {
            int last = a.length - 1;
            StringBuilder builder = new StringBuilder();
            builder.append("[");
            for (int i = 0; i < last; i++) {
                builder.append(a[i]);
                builder.append(",");
            }
            if (last > -1) {
                builder.append(a[last]);
            }
            builder.append("]");
            System.out.println(builder.toString());
        }
    }
}
