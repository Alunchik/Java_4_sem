package task7.bridge;

public class BankSystem extends Program{

    public BankSystem(Developer dev) {
        super(dev);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        dev.writeCode();
    }
}
