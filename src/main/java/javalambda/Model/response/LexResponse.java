package javalambda.Model.response;

import javalambda.Model.response.DialogAction;

import java.util.Map;

// Resource: https://github.com/arun-gupta/lex-java
public class LexResponse {
    Map<String, String> sessionAttributes;
    private DialogAction dialogAction;

    public LexResponse() { }

    /**
     *
     * @param dialogAction
     */
    public LexResponse(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    /**
     *
     * @param dialogAction
     * @param sessionAttributes
     */
    public LexResponse(DialogAction dialogAction, Map<String, String> sessionAttributes) {
        this.dialogAction = dialogAction;
        this.sessionAttributes = sessionAttributes;
    }

    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    public DialogAction getDialogAction() {
        return dialogAction;
    }

    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }
}
