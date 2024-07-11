package AlienTranslator;

public class DoubleSternianer implements AlienTranslator{
    @Override
    public String translate(String text) {
        String[] testArray = text.split("");
        return  String.join("**",testArray);
    }
}
