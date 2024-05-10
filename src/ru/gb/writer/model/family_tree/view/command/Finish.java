package ru.gb.writer.model.family_tree.view.command;

import ru.gb.writer.model.family_tree.view.ConsoleUI;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super("Finish", consoleUI);
    }

    @Override
    public void execute(){
        super.getConsoleUI().finish();
    }
}