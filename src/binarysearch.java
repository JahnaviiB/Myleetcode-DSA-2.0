public class binarysearch {
    int BinarySearch(int[] arr,int low,int high, int x){
        if(low <= high){
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

    public static void main(String[] args){
        binarysearch ob = new binarysearch();
        int arr[] = {5,6,2,8,12,4};
        int x = 5;
        int n = arr.length;
        int result = ob.BinarySearch(arr,0,n-1,x);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at "+ result);


    }
}
