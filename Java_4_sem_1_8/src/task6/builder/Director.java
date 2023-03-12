package task6.builder;

public class Director {
    private ConcreteBuilder builder;

    public Director(ConcreteBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("cant work without product builder");
        }
    }

    public Product makeProduct() {
        return builder.doA().doB().doC().build();
    }
}
