package ru.gb.writer.model.family_tree.writer;

import ru.gb.writer.model.family_tree.tree.FamilyTree;

import javax.swing.tree.TreeNode;
import java.io.Serializable;

public interface Writable <T extends TreeNode<T>> {
    boolean writeTreeAsByteCode(Serializable outputObject);
    boolean writeSubjectAsByteCode(Serializable outputObject);
    FamilyTree<T> readTreeFromByteCodeFile();
    T readSubjectFromByteCodeFile();



}