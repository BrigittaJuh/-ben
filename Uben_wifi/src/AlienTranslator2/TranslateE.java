package AlienTranslator2;

public class TranslateE implements AlienTranslator{

    @Override
    public String replace(String text) {
        return text.replace('3', 'e');
    }
}
