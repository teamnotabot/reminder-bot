package javalambda.Model.response;

public class DialogAction {
    protected String type;
    protected String fulfillmentState;
    protected Message message;
    protected ResponseCard responseCard;

    public DialogAction() {}

    public DialogAction(String type, String fulfillmentState, Message message) {
        this.type = type;
        this.fulfillmentState = fulfillmentState;
        this.message = message;
    }

    public DialogAction(String type, String fulfillmentState, Message message, ResponseCard responseCard) {
        this.type = type;
        this.fulfillmentState = fulfillmentState;
        this.message = message;
        this.responseCard = responseCard;
    }

    public ResponseCard getResponseCard() {
        return responseCard;
    }

    public void setResponseCard(ResponseCard responseCard) {
        this.responseCard = responseCard;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFulfillmentState() {
        return fulfillmentState;
    }

    public void setFulfillmentState(String fulfillmentState) {
        this.fulfillmentState = fulfillmentState;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
