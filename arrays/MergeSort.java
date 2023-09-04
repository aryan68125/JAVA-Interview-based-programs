public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int left_size = mid - left + 1;
        int right_size = right - mid;

        // Create temporary arrays
        int[] L = new int[left_size];
        int[] R = new int[right_size];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < left_size; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < right_size; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into arr[left..right]
        int i = 0, j = 0, k = left;
        while (i < left_size && j < right_size) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of L[], if any
        while (i < left_size) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy the remaining elements of R[], if any
        while (j < right_size) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}