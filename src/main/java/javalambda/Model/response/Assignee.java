package javalambda.Model.response;

public class Assignee {
    protected String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Assignee() { }

    public Assignee(String login) {
        this.login = login;
    }
}
