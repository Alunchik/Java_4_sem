package task8.command;

public class InsertCommand implements Command{
    Database db;

    public InsertCommand(Database db) {
        this.db = db;
    }

    @Override
    public void execute() {
        db.insert();
    }
}
