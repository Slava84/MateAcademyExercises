package homework_4.textAnalyzerImpl;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        Label label = getLabel();

        for (String str : getKeywords()) {
            if (text.indexOf(str) >= 0) {
                label = Label.SPAM;
                break;
            }
        }
        return label;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.OK;
    }
}
