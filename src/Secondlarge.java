public class Secondlarge {
    public static int findsecondlarge(int[] a){
        int first,second;
        if(a[0] > a[1]){
            first = a[0];
            second = a[1];
        }
        else{
            first = a[1];
            second = a[0];
        }
        for(int i = 2; i<a.length;i++){
            if(a[i] > first){
                second = first;
                first = a[i];
            }
            else if(a[i] < first && a[i] > second ){
                second = a[i];
            }
        }
        return second;
    }
    public static void main(String[] args){
        int result = findsecondlarge(new int[] {1,4,6,2,77,17});
        System.out.println(result);
    }
}
