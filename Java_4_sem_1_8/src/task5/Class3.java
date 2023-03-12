package task5;

public class Class3 {
    private static Class3 instance;

    private Class3(){

    }

    static {
        try {
            instance = new Class3();
        } catch (Exception e){
            throw new RuntimeException("Error");
        }
    }
    public static Class3 getInstance(){
        return instance;
    }
}
