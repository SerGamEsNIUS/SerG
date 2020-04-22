package bean;

public abstract class Entity {
    protected Long id;
    protected String name;

    protected Entity() {
    }

    protected Entity(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
