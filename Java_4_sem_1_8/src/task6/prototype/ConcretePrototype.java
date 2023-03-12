package task6.prototype;

public class ConcretePrototype {
    Type type;
    public enum Type {
        ONE, TWO
    }
    public  ConcretePrototype copy(){
        return new ConcretePrototype();
    }
    public void setType(Type type){
        this.type = type;
    }
}
