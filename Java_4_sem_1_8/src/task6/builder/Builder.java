package task6.builder;

public interface Builder {
    Builder doA();
    Builder doB();
    Builder doC();
    Product build();
}
