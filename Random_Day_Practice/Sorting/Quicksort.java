import java.util.*;

public class Quicksort {
    public static void Quicksort(int arr[]) {
        int n = arr.length;
        sort(arr, 0, n - 1);
    }

    public static void sort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        try {
            int p = partion(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        } catch (Exception e) {
            System.out.println("Error is :" + e);
        }
    }

    public static int partion(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= high && pivot > arr[i]) {
                i++;
            }
            while (j >= low && pivot < arr[j]) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                break;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 23, 5, 234, 5, 1, 5 };
        Quicksort(arr);
        System.out.println("Hello Bro" + Arrays.toString(arr));
    }
}