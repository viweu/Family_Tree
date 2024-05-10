package ru.gb.writer.model.family_tree.view.command;

import ru.gb.writer.model.family_tree.view.ConsoleUI;

public class GetFamilyTree extends Command {

    public GetFamilyTree(ConsoleUI consoleUI) {
        super("Get list of family tree", consoleUI);
    }

    @Override
    public void execute(){
        super.getConsoleUI().getFamilyTree();
    }
}
