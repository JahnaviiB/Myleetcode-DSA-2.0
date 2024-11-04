public class Sumofdigits {
    public static int sumdigits(int n){
        int sum = 0;
        if(n == 0){
            return sum;
        }
        else{
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;
            return sum + sumdigits(n);
        }
    }

    public static void main(String[] args){
        int result = sumdigits(17081997);
        System.out.println(result);
    }
}
