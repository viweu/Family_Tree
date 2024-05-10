package ru.gb.writer.model.family_tree.view.command;

import ru.gb.writer.model.family_tree.view.ConsoleUI;

public class SortByDateOfBirth extends  Command{
    public SortByDateOfBirth(ConsoleUI consoleUI) {
        super("Sort by date of birth", consoleUI);
    }

    @Override
    public void execute(){
        super.getConsoleUI().sortByDateOfBirth();
    }
}