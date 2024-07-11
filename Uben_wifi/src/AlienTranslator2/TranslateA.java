package AlienTranslator2;

public class TranslateA implements AlienTranslator{
    @Override
    public String replace(String text) {
        return text.replace('4','a');
    }
}
