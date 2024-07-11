package AlienTranslator2;

public class TranslateO implements AlienTranslator{
    @Override
    public String replace(String text) {
        return text.replace('0', 'o');
    }
}
