package homeworkDay2;

import java.util.function.Function;

public class Zad3 {
    public static void main(String[] args) {
        String sample = "CODERSLAB";
        Function<String, String> sampleText = n -> {
            String newWord = "";
            String lowerSample = sample.toLowerCase();
            for (int i = 2; i < n.length() - 2; i++) {
                newWord += lowerSample.charAt(i);
            }
            return newWord;
        };
        System.out.println(sampleText.apply(sample));
    }
}
