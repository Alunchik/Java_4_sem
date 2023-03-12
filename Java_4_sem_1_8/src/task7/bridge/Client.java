package task7.bridge;

public class Client {
    public static void main(String[] args) {
        Program[] programs = {new BankSystem( new JavaDeveloper())};
        for(Program program: programs){
            program.developProgram();
        }
    }
}
