package Üb14;

public class Üb_14_ {
    public static void main(String[] args) {
       String[] words = {"almak", "bananok", "körtek", "barackok"};

       int i  = 0;

       while (i < words.length){
           if (words[i].length() > 4) {
               System.out.println(words[i]);
           }
           i++;
       }


    }
}
