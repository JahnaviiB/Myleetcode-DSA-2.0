import java.util.Arrays;

public class taskcompletion {
    public static void main(String[] args){
        int n = 5;
        int k = 3;
        int[] rewards1 = {5, 4, 3, 2, 1};
        int[] rewards2 = {1, 2, 3, 4, 5};
        int result = findmaxrewards(k,rewards1,rewards2);
        System.out.println("Maximum rewards earned is: "+ result);
    }
    public static int findmaxrewards(int k,int[] rewards1,int[] rewards2){
        int n = rewards1.length;
        int[] diff = new int[n];
        for(int i =0;i<n;i++){
            diff[i] = rewards1[i] - rewards2[i];
        }
        Arrays.sort(diff);
        int count = 0;
        for(int i  = 0;i <= n-1;i++){
            if(i >= n-k){
                count += rewards1[i];
            }
            else{
                count += Math.max(rewards1[i],rewards2[i]);
            }
        }
        return count;

    }
}
