package week05;

public class StringUtils {
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i-- ){
            char c = s.charAt(i);
            sb.append(c); 
        }
        return sb.toString();
    }

    public static String ExplodedString(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            for (int j = 0; j<i+1; j++){
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }

    public static String sortString(String s){
        char[] c = s.toCharArray();  
        java.util.Arrays.sort(c);
        return new String(c);
    }
        
    public static Boolean isAnagram(String s1, String s2){

        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();

        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(a2);

        return java.util.Arrays.equals(a1, a2);

    }

    public static String swapFirstLast(String s1)
        {
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
        String w = words[i];

        if (w.length() > 1) {
            char first = w.charAt(0);
            char last = w.charAt(w.length() - 1);

            result.append(last)
                  .append(w.substring(1, w.length() - 1))
                  .append(first);
        } else {
            
            result.append(w);
        }

        if (i < words.length - 1) {
            result.append(" ");
        }
    }

    return result.toString();
}
    
        

    public static void main(String[] args) {
        String s1 = "badc";
        String s2 = "murmur";
        System.out.println(reverse(s1));
        System.out.println(ExplodedString(s1));
        System.out.println(sortString(s1));
        System.out.println(isAnagram(s1, s2));
        System.out.println(swapFirstLast(s1));
    }
    
}    
