package testinterface;

public abstract class TestAbstract  {
    protected String description;

    public TestAbstract(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
