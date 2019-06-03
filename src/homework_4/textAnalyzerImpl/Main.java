package homework_4.textAnalyzerImpl;

public class Main {
    public static void main(String[] args) {
        String text1 = "This is the text witch has a negative string \"spam\" and bad smile \":(\" and a very long length.";
        String text2 = "This is a very good text))";
        String[] keywords = {"spam", "bad"};
        int maxLength = 40;

        TextAnalyzer[] textAnalyzers1 = {
                new SpamAnalyzer(keywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(maxLength)
        };

        TextAnalyzer[] textAnalyzers2 = {
                new TooLongTextAnalyzer(maxLength),
                new SpamAnalyzer(keywords),
                new NegativeTextAnalyzer()
        };

        TextAnalyzer[] textAnalyzers3 = {
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(maxLength),
                new SpamAnalyzer(keywords)
        };

        System.out.println("Повертає: " + checkLabels(textAnalyzers1, text1));
        System.out.println("Повертає: " + checkLabels(textAnalyzers2, text1));
        System.out.println("Повертає: " + checkLabels(textAnalyzers3, text1));
        System.out.println();
        System.out.println("Повертає: " + checkLabels(textAnalyzers1, text2));
        System.out.println("Повертає: " + checkLabels(textAnalyzers2, text2));
        System.out.println("Повертає: " + checkLabels(textAnalyzers3, text2));
    }

    private static Label checkLabels(TextAnalyzer[] textAnalyzers, String text) {
        for (TextAnalyzer textAnalyzer : textAnalyzers) {
            if (textAnalyzer.processText(text) != Label.OK) {
                return textAnalyzer.processText(text);
            }
        }
        return Label.OK;
    }
}
