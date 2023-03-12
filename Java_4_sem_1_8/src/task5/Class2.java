package task5;

public class Class2 {
    private static final Class2 instance = new Class2();
    private Class2(){

    }
    public static Class2 getInstance(){
        return instance;
    }
}
