package javalambda.Model.request;

import javalambda.Model.request.Bot;
import javalambda.Model.request.Intent;

import java.util.Map;

public class LexRequest {
    private String messageVersion;
    private String invocationSource;
    private String userId;
    private Map<String, String> sessionAttributes;
    private Bot bot;
    private String outputDialogMode;
    private Intent currentIntent;
    private String confirmationStatus;


    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    public String getInvocationSource() {
        return invocationSource;
    }

    public void setInvocationSource(String invocationSource) {
        this.invocationSource = invocationSource;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    public void setSessionAttributes(Map<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public String getOutputDialogMode() {
        return outputDialogMode;
    }

    public void setOutputDialogMode(String outputDialogMode) {
        this.outputDialogMode = outputDialogMode;
    }

    public Intent getCurrentIntent() {
        return currentIntent;
    }

    public void setCurrentIntent(Intent currentIntent) {
        this.currentIntent = currentIntent;
    }

    public String getConfirmationStatus() {
        return confirmationStatus;
    }

    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }
}
