package ru.gb.writer.model.family_tree.tree.sorting;

import ru.gb.writer.model.family_tree.person.TreeNode;

import java.util.Comparator;

public class SortByDateOfBirth<T extends TreeNode<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}