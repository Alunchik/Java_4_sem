package task8.command;

public class DeleteCommand implements Command{
    Database db;

    public DeleteCommand(Database db) {
        this.db = db;
    }

    @Override
    public void execute() {
        db.delete();
    }
}
