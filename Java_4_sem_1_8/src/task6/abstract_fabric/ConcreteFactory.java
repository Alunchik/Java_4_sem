package task6.abstract_fabric;

public class ConcreteFactory implements Factory{

    @Override
    public Product createProductA() {
        System.out.println("Product A created");
        return new ConcreteProductA();
    }

    @Override
    public Product createProductB() {
        System.out.println("Product B created");
        return new ConcreteProductB();
    }
}
