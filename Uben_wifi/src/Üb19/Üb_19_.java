package Üb19;

public class Üb_19_ {
    public static void main(String[] args) {
        String[] words = {"radar", "level", "hello", "deed"};

        System.out.println("Palindromok:");
        for (String word : words) {
            if (isPalindrome(word)){
                System.out.println(word);
            }
        }

    }
    public static boolean isPalindrome(String word){
        int n = word.length();
        for (int i = 0; i < n / 2 ; i++) {
            if (word.charAt(i) != word.charAt(n - i -1)){
                return  false;
            }

        }
        return true;
    }
}
