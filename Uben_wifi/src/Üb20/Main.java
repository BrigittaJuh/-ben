package Üb20;

public class Main {
    public static void main(String[] args) {
        String[] sentences = {
                "Ez az első mondat.",
                "Ez itt egy második mondat, amely valamivel hosszabb.",
                "Ez egy rövid mondat.",
                "Ez a mondat sokkal hosszabb, mert több szót tartalmaz, és részletesebb."
        };

        int maxWordCount = 0;
        for (String sentence : sentences){
            int wordCount = countWords(sentence);
            if(wordCount > maxWordCount) {
                maxWordCount = wordCount;
            }
        }
        System.out.println(" A leghosszab mondat szavainak szama:" + maxWordCount);

    }
    public static int countWords(String sentence){
        if (sentence == null || sentence.isEmpty()){
            return 0;
        }
        String[] words = sentence.split("\\S+");
        return  words.length;
    }
}
