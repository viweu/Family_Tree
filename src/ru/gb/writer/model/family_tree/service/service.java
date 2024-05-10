package ru.gb.writer.model.family_tree.service;

import ru.gb.writer.model.family_tree.person.Gender;
import ru.gb.writer.model.family_tree.person.Human;
import ru.gb.writer.model.family_tree.tree.FamilyTree;
import ru.gb.writer.model.family_tree.writer.Writable;

import java.time.LocalDate;
import java.util.ArrayList;

public class Service implements Writable {
    private long genId;
    private FamilyTree familyTree;;

    public Service(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public Service() {
        this.familyTree = new FamilyTree();
    }

    public boolean addSubjectToFamilyTree(String name, LocalDate dob, Gender gender) {
        Human human = new Human(name, dob, gender);
        human.setId(genId++);
        familyTree.addPersonToFamily(human);
        return true;
    }


    public boolean addSubjectToFamilyTree(String name,
                                          LocalDate dob, LocalDate dod,
                                          Gender gender, Human father, Human mother) {
        Human human = new Human(name, dob, dod, gender, father, mother);
        human.setId(genId++);
        familyTree.addPersonToFamily(human);
        return true;
    }

    public boolean addSubjectToFamilyTree(String name,
                                          LocalDate dob, Gender gender, Human father, Human mother) {
        Human human = new Human(name, dob, gender, father, mother);
        human.setId(genId++);
        familyTree.addPersonToFamily(human);
        return true;
    }

    public boolean addSubjectToFamilyTree(Human human) {
        human.setId(genId++);
        familyTree.addPersonToFamily(human);
        return true;
    }




    @Override
    public FamilyTree readTreeFromByteCodeFile() {
        return null;
    }

    public ArrayList<String> getListOfNamesFromFamilyTree() {
    }

    public Object getFamilyTree() {
    }
