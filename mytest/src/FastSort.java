import java.util.Arrays;
import java.util.Random;

public class FastSort {

    public static void main(String[] args) {
        java.util.Random r = new Random();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1000);
        }
        sort(arr, 0, arr.length - 2, arr.length - 1);
    }

    public static void sort(Integer[] arr, int l, int r, int p) {
        System.out.println(Arrays.asList(arr));
        for (; l < r; l++)
            if (arr[l] > arr[p])
                break;
        for (; r > l; r--)
            if (arr[r] < arr[p])
                break;
        if (l == r) {
            change(arr, l, p);
        }
    }

    public static void change(Integer[] arr, int l, int r) {
        int t = arr[r];
        arr[r] = arr[l];
        arr[l] = t;
    }


}
