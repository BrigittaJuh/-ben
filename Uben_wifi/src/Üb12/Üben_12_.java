package Üb12;

public class Üben_12_ {
    public static void main(String[] args) {
        String[] words = {"ut", " haza", "kocsi", "fa"};
        String shortestWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < shortestWord.length()){
                shortestWord = words[i];
            }

        }
        System.out.println(shortestWord);
    }
}
