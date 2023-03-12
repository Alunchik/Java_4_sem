package task8.command;

public class Client {
    public static void main(String[] args) {
        Database db = new Database();
        Worker worker = new Worker(
            new InsertCommand(db),
            new UpdateCommand(db),
                new SelectCommand(db),
                new DeleteCommand(db));
        worker.deleteRecord();
        worker.selectRecord();
        worker.updateRecord();
        worker.insertRecord();
    }
}
