package javalambda.Model.response;

public class ResponseButton {
    protected String text;
    protected String value;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ResponseButton() {}

    public ResponseButton(String text, String value) {
        this.text = text;
        this.value = value;
    }
}
