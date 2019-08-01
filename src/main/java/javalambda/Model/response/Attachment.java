package javalambda.Model.response;

public class Attachment {
    protected String title;
    protected String subTitle;
    protected String imageUrl;
    protected String attachmentLinkUrl;
    protected  ResponseButton[] buttons;

    public ResponseButton[] getButtons() {
        return buttons;
    }

    public void setButtons(ResponseButton[] buttons) {
        this.buttons = buttons;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAttachmentLinkUrl() {
        return attachmentLinkUrl;
    }

    public void setAttachmentLinkUrl(String attachmentLinkUrl) {
        this.attachmentLinkUrl = attachmentLinkUrl;
    }

    public Attachment() {}

    public Attachment(String title, String subTitle, String imageUrl, String attachmentLinkUrl) {
        this.title = title;
        this.subTitle = subTitle;
        this.imageUrl = imageUrl;
        this.attachmentLinkUrl = attachmentLinkUrl;
    }

    public Attachment(String title, String subTitle, String imageUrl, String attachmentLinkUrl, ResponseButton[] buttons) {
        this.title = "Title: "+title;
        this.subTitle = "Assigned to: "+subTitle;
        this.imageUrl = imageUrl;
        this.attachmentLinkUrl = attachmentLinkUrl;
        this.buttons = buttons;
    }
}
