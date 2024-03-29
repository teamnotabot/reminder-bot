package javalambda.Model.request;

public class Bot {
    private String name;
    private String alias;
    private String version;

    public Bot() {}

    public Bot(String name, String alias, String version){
        this.name = name;
        this.alias = alias;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
