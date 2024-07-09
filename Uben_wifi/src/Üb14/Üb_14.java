package Üb14;

public class Üb_14 {
    public static void main(String[] args) {
        String[] words = {"alma", "kaposzta", "paradicsom", "tea"};
        int i = 0;
        System.out.println("Szavak amik több mint 4 betüböl allnak");

        while (i < words.length){
            if (words[i].length() > 4){
                System.out.println(words[i]);
            }
            i++;

        }
    }
}
