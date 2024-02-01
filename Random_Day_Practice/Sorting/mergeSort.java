import java.util.Arrays;

public class mergeSort {

    public static int[] mergeSort(int arr[]) {
        int n = arr.length;
        if (n <= 1) {
            return arr;
        }
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, (int) (n / 2)));
        int right[] = mergeSort(Arrays.copyOfRange(arr, (int) (n / 2), n));
        return merge(left, right);
    }

    public static int[] merge(int left[], int right[]) {
        int n1 = left.length;
        int n2 = right.length;
        int n = n1 + n2;
        int i1 = 0, i2 = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i1 == n1) {
                arr[i] = right[i2++];
            } else if (i2 == n2) {
                arr[i] = left[i1++];
            } else {
                if (left[i1] > right[i2]) {
                    arr[i] = right[i2++];
                } else {
                    arr[i] = left[i1++];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 45, 3, 45, 2, 45, 12, 4, 2, 5, 31 };
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
