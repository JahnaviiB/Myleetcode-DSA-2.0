import java.util.HashMap;

public class Eachoccurence {
    public static void charcount(String a){
        HashMap<Character,Integer> count = new HashMap<Character,Integer>();
        char[] a1 = a.toCharArray();
        for(char c: a1){
            if(count.containsKey(c)){
                count.put(c,count.get(c)+1);
            }
            else{
                count.put(c,1);
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args){
       charcount("Jaahhnn");
    }
}
