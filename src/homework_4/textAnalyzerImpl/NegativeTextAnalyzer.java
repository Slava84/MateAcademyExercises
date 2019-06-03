package homework_4.textAnalyzerImpl;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    private String[] negText = {":(", "=(", ":|"};

    @Override
    public Label processText(String text) {
        Label label = getLabel();

        for (String str : getKeywords()) {
            if (text.indexOf(str) >= 0) {
                label = Label.NEGATIVE_TEXT;
                break;
            }
        }
        return label;
    }

    @Override
    protected String[] getKeywords() {
        return negText;
    }

    @Override
    protected Label getLabel() {
        return Label.OK;
    }
}
