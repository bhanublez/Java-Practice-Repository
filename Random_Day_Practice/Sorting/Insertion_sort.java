import java.util.Arrays;

public class Insertion_sort {

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 2, 4, 234, 65, 2, 3, 5, 42 };
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    
}
