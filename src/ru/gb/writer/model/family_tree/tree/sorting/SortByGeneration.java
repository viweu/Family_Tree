package ru.gb.writer.model.family_tree.tree.sorting;

import ru.gb.writer.model.family_tree.person.TreeNode;

import java.util.Comparator;

public class SortByGeneration <T extends TreeNode<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getGeneration(), o2.getGeneration());
    }
}
