package ru.gb.writer.model.family_tree.tree;


import ru.gb.writer.model.family_tree.tree.sorting.SortByGeneration;
import ru.gb.writer.model.family_tree.view.command.SortByAge;
import ru.gb.writer.model.family_tree.view.command.SortByDateOfBirth;
import ru.gb.writer.model.family_tree.view.command.SortByName;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class FamilyTree<E extends FamilyTree.TreeNode<E>> implements Serializable, Iterable<E> {
    private ArrayList<E> familyTree;

    public FamilyTree() {
        familyTree = new ArrayList<>();
    }

    public FamilyTree(ArrayList<E> tree) {
        familyTree = tree;
    }

    public boolean addPersonToFamily(E person) {
        if (person == null) {
            return false;
        }
        if (!familyTree.contains(person)) {
            familyTree.add(person);
            return true;
        } else {
            System.out.println("This subject already recorded in the family tree");
            return false;
        }
    }


    public E findUnitByName(String name) {
        for (E person : this) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
            if (person.getName().contains(name)) {
                return person;
            }
        }
        return null;
    }


    public E findHumanByDateOfBirth(LocalDate dob) {
        for (E person : this) {
            if (person.getDateOfBirth().isEqual(dob)) {
                return person;
            }
        }
        return null;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        //int gen = 0;
        for (E subject : familyTree) {
//            if (gen != subject.getGeneration()) {
//                sb.append("==".repeat(20)).append("\n");
//                gen = subject.getGeneration();
//                sb.append("Generation ").append(gen).append(": \n");
//            }
            sb.append(subject).append("\n").append("-".repeat(20)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getInfo();
    }


    public ArrayList<E> sortByAge() {
        ArrayList<E> res = familyTree;
        res.sort(new SortByAge<E>());
        return res;
    }

    public ArrayList<E> sortByDateOfBirth() {
        ArrayList<E> res = familyTree;
        res.sort(new SortByDateOfBirth<E>());
        return res;
    }

    public ArrayList<E> sortByName() {
        ArrayList<E> res = familyTree;
        res.sort(new SortByName<>());
        return res;
    }

    public ArrayList<E> sortByGeneration() {
        ArrayList<E> res = familyTree;
        res.sort(new SortByGeneration<>());
        return res;
    }

    publicgetName ArrayList<E> getFamilyTree() {
        return familyTree;
    }

    public ArrayList<String> getListOfNames() {
        ArrayList<String> listOfNames = new ArrayList<>();
        for (E item : this) {
            listOfNames.add(item.getName() + "\n");
        }
        return listOfNames;
    }
    public ArrayList<String> getListOfNamesFromInputList(ArrayList<E> inputList) {
        ArrayList<String> listOfNames = new ArrayList<>();
        for (E item : inputList) {
            listOfNames.add(item.() + "\n");
        }
        return listOfNames;
    }

    @Override
    public Iterator<E> iterator() {
        return new HumanIterator<>(familyTree);
    }

    private class TreeNode<E> {
        private String name;
        private OffsetDateTime dateOfBirth;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public OffsetDateTime getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(OffsetDateTime dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }
}

