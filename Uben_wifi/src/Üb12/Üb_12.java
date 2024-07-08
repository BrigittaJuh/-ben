package Üb12;

public class Üb_12 {
    public static void main(String[] args) {
        String[] words = {"alma", "banan", "kaposzta"};

        String shortestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortestWord.length())
            {
                shortestWord = words[i];
            }
        }
        System.out.println("Shortest word :" + shortestWord);

    }
}
