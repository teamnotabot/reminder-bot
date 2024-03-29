package javalambda.Model.response;

public class Message {
    private String contentType;
    private String content;

    public Message() {}

    public Message(String contentType, String content){
        this.contentType = contentType;
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
