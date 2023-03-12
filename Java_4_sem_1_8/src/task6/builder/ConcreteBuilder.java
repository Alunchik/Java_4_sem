package task6.builder;

public class ConcreteBuilder implements Builder{
    private int a;
    private int b;
    private int c;

    public ConcreteBuilder() {
        super();
    }


    @Override
    public Builder doA() {
        System.out.println("do a");
        this.a = 1;
        return this;
    }

    @Override
    public Builder doB() {
        System.out.println("do b");
        this.b = 1;
        return this;
    }

    @Override
    public Builder doC() {
        System.out.println("do c");
        this.c = 1;
        return this;
    }


    @Override
    public Product build() {
        return new Product(a, b, c);
    }
}
