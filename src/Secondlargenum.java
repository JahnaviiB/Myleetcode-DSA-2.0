import java.util.Arrays;

public class Secondlargenum {
    public static int getsecondnum(int[] a,int k){
        Arrays.sort(a);
        return a[k-2];
    }
 public static void main(String[] args) {
     int a[] = {2, 3, 5, 7, 1, 9};
     System.out.println(getsecondnum(a, 6));
 }
}
