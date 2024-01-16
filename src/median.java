import java.util.Arrays;
public class median {
    public static void main (String args[]){
        int[] n1 = {1,2};
        int[] n2 = {3,4};
        int[] n3 = new int[n1.length + n2.length];
        int k = 0;
        for(int i = 0; i < n1.length; i++){
            n3[k++] = n1[i];
        }
        for(int j = 0; j< n2.length; j++){
            n3[k++] = n2[j];
        }

        Arrays.sort(n3);
        int total = n3.length;
         if(total % 2 == 1){
             System.out.println((double) n3[total / 2]);
        }
         else{
             int m1 = n3[total / 2 - 1];
             int m2 = n3[total / 2];
             System.out.println(((double) m1 + (double) m2) / 2.0);


        }

    }
}
