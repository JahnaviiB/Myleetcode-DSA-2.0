public class largenum {
    static int arr[] = {1,4,5,2,17};
    static int largest()
    {
        int i;
        int max = arr[0];
        for(i=1;i<arr.length;i++)
            if(arr[i] > max)
                max = arr[i];
        return max;
    }
public static void main(String args[])
{

    System.out.println("Largest num in the given array is: "+ largest());
}
}
