import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class anagram {
    public static void isanagram(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        boolean result = true;
        if( n1 != n2){
            result = false;
        }
        else{
            char[] s1array = s1.toCharArray();
            char[] s2array = s2.toCharArray();
            Arrays.sort(s1array);
            Arrays.sort(s2array);
            result = Arrays.equals(s1array,s2array);
        }
        if(result){
            System.out.println("Given strings are anagrams");
        }
        else{
            System.out.println("Given strings are not anagrams");
        }
    }
    public static void main(String[] args){
        isanagram("Jahn","nhaJ");
    }
}
