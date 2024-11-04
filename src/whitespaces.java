public class whitespaces {
    public static String whitespaces(String s1){
        s1 = s1.replaceAll("\\s", "");
        return s1;

    }

    public static void main(String[] args){
        String str = "J A H N";
        String result = whitespaces(str);
        System.out.println(result);
    }
}
