import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        String[] textSpliter = text.split("\\P{IsAlphabetic}+");
        Set<String> words = new HashSet<String>(Arrays.asList(textSpliter));
        return words.contains(word);
    }
}
