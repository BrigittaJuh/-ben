package AlienTranslator;

public class SingleSternianer implements  AlienTranslator{
    @Override
    public String translate(String text) {
       String[] textArray = text.split("");
       return  String.join("*", textArray);
    }
}
