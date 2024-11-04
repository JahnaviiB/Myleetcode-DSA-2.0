import java.util.Arrays;

public class Duplicatesarray {
    public static void isduplicates(int a1[], int n1){
        for(int i = 0; i < n1-1;i++){
            for(int j=i+1;j<n1;j++){
                if(a1[i] == a1[j]){
                    System.out.println("Duplicate elements are :"+a1[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        int a[] = {12,4,5,2,6,6,12};
        int n = a.length;
        isduplicates(a,n);
    }
}