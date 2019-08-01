package javalambda.Model.github;

import javalambda.Model.response.Assignee;

public class Issue {
    protected int id;
    protected String url;
    protected String repo_url;
    protected String html_url;
    protected String title;
    protected String body;
    protected String state;
    protected Assignee assignee;

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepo_url() {
        return repo_url;
    }

    public void setRepo_url(String repo_url) {
        this.repo_url = repo_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Issue() {}

    public Issue(int id, String url, String repo_url, String title, String body, String state, Assignee assignee, String html_url){
        this.id = id;
        this.url = url;
        this.repo_url = repo_url;
        this.title = title;
        this.body = body;
        this.state = state;
        this.assignee = assignee;
        this.html_url = html_url;
    }
}
