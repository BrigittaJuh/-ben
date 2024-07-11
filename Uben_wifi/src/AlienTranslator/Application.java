package AlienTranslator;

public class Application {
    public static void main(String[] args) {


        AlienTranslator single = new SingleSternianer();
        AlienTranslator doubleS = new DoubleSternianer();

        System.out.println(single.translate("Hello"));
        System.out.println(doubleS.translate("Hello"));


    }
}