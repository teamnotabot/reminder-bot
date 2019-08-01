package javalambda.Model.response;

import java.util.List;

public class ResponseCard {
    protected int version;
    protected String contentType;
    protected Attachment[] genericAttachments;

    public Attachment[] getGenericAttachments() {
        return genericAttachments;
    }

    public void setGenericAttachments(Attachment[] genericAttachments) {
        this.genericAttachments = genericAttachments;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }



    public ResponseCard(){}

    public ResponseCard(int version, String contentType, Attachment[] genericAttachments) {
        this.version = version;
        this.contentType = contentType;
        this.genericAttachments = genericAttachments;
    }
}
