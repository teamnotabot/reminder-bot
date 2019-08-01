package javalambda.Model;

public class Pokemon {
    private int id;
    private String name;
    private int order;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pokemon() {}

    public Pokemon(int id){
        this.id = id;
    }


}
