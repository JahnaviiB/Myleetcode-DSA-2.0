import java.util.Arrays;

public class slargest {
    public static void main(String[] args){
        int[] arr = {3,5,7,12,4,6,99,77};
        int secondlargest = findsecond(arr);
        System.out.println("Second largest element is :"+secondlargest );
    }
    public static int findsecond(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
}
