package task5;

public class Class1 {
    private static Class1 instance;
    private Class1(){

    }
    public static synchronized Class1 getInstance(){
        if(instance==null){
            instance = new Class1();
        }
        return instance;
    }
}
