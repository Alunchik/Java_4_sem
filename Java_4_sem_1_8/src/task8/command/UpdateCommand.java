package task8.command;

import task7.composite.Developer;

public class UpdateCommand implements Command{
    Database db;

    public UpdateCommand(Database db) {
        this.db = db;
    }

    @Override
    public void execute() {
        db.update();
    }
}
