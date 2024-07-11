package AlienTranslator2;

public class Application {
    public static void main(String[] args) {
        String alienText = "H3ll0 W0rld, 4li3ns 4r4 h3r3!";

       AlienTranslator translatorA = new TranslateA();
       AlienTranslator translatorO = new TranslateO();
       AlienTranslator translatorE = new TranslateE();

       String humanText = alienText;

       humanText = translatorA.replace(humanText);
       humanText = translatorO.replace(humanText);
       humanText = translatorE.replace(humanText);

        System.out.println("Alien Massage : " + alienText);
        System.out.println("Human Translate : " + humanText);


    }
}
