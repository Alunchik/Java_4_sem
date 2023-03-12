package task7.bridge;

public abstract class Program {
//    Abstraction
    protected  Developer dev;

    protected Program(Developer dev){
        this.dev = dev;
    }
    public abstract void developProgram();
}
