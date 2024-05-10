package ru.gb.writer.model.family_tree.view;

import ru.gb.writer.model.family_tree.view.command.*;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private final List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        this.commands = new ArrayList<>();
        commands.add(new AddSubject(consoleUI));
        commands.add(new GetFamilyTree(consoleUI));
        commands.add(new SortByName(consoleUI));
        commands.add(new SortByDateOfBirth(consoleUI));
        commands.add(new SortByAge(consoleUI));
        commands.add(new WriteTreeAsByteCode(consoleUI));
        commands.add(new ReadTreeFromByteCodeFile(consoleUI));
        commands.add(new Finish(consoleUI));
    }

    public int getNumberOfCommands() {
        return commands.size();
    }
    public String getMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Functions:\n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1).append(". ")
                    .append(commands.get(i).getDescription()).append("\n");
        }
        return stringBuilder.toString();
    }
    public void execute(int choice){
        Command command = commands.get(choice - 1);
        command.execute();
    }
}

