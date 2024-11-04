public class Duplicates {
    public static String RemoveDuplicates(String s){
        int n = s.length();
        char[] s1 = s.toCharArray();
        int j = 0;
        for(int i =0; i < n-1; i++){
            if(s1[i] != s1[i+1]){
                s1[j++] = s1[i];
             }
        }
        s1[j++] = s1[n-1];
        return new String(s1,0,j);
    }
    public static void main(String[] args){
        String result = RemoveDuplicates("JJaahnnn");
        System.out.println(result);
    }
}