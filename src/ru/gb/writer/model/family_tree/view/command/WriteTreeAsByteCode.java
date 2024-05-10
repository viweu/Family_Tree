package ru.gb.writer.model.family_tree.view.command;

import ru.gb.writer.model.family_tree.view.ConsoleUI;

public class WriteTreeAsByteCode extends Command{

    public WriteTreeAsByteCode(ConsoleUI consoleUI) {
        super("Write family tree as byte code", consoleUI);
    }

    @Override
    public void execute() {
        super.getConsoleUI().writeTreeAsByteCode();
    }
}