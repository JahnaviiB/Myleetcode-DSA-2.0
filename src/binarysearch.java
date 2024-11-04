public class binarysearch {
    int BinarySearch(int[] arr, int low, int high, int x) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;

    }
}