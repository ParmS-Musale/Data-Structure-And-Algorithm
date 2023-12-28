public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Quick_sort(int arr[], int si, int ei) {
        if (si < ei) {
            int pidx = partition(arr, si, ei);
            Quick_sort(arr, si, pidx - 1); // left
            Quick_sort(arr, pidx + 1, ei); // right
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Swap
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 82, 5 };
        Quick_sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
