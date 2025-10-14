import java.util.Arrays;

public class AnagramStrings {

    public static void checkForAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char [] charStr1 = str1.toCharArray();
            char [] charStr2 = str2.toCharArray();

            Arrays.sort(charStr1);
            Arrays.sort(charStr2);

            boolean result = Arrays.equals(charStr1, charStr2);

            if(result){
                System.out.println("Both the strings are Anagram of each other");
            }else{
                System.out.println("Both the strings are not Anagram of each other");
            }

        }else{
            System.out.println("Both the strings are not Anagram of each other");
        }
    }
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";
        checkForAnagram(str1, str2);
    }
}
