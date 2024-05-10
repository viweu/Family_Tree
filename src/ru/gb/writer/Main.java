package ru.gb.writer;

import ru.gb.writer.model.family_tree.person.Gender;
import ru.gb.writer.model.family_tree.person.Human;
import ru.gb.writer.model.family_tree.service.Service;
import ru.gb.writer.model.family_tree.view.ConsoleUI;

import javax.swing.text.View;
import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Human danya = new Human("Brizhaty Daniil Sergeevich", LocalDate.of(2000, 6, 23), Gender.Male);danya.setDeadDate(LocalDate.of(2088, 5, 13));
//        Human hades = new Human("Brizhaty Hades Daniilovich", LocalDate.of(2026, 6, 10 ), Gender.Male);
//        Human david = new Human("Brizhaty David Daniilovich ", LocalDate.of(2023, 12, 10), Gender.Male);
//        Human sonya = new Human("Orlova Sofia Ivanovna", LocalDate.of(2002, 11, 20), Gender.Female);
//
//        Human vika = new Human("Sofronova-Brizhataya Victoria Sergeevna", LocalDate.of(2001, 11, 01), LocalDate.of(2070, 01, 01), Gender.Female, null, null);
//       Human ari = new Human("Brizhataya Ariella Daniilovna", LocalDate.of(2030, 11, 11), LocalDate.of(2105, 4, 03), Gender.Female, danya, sonya);/        Human mia = new Human("Vladimirova(Brizhaty) Mia Daniilovna", LocalDate.of(2030, 11, 11), LocalDate.of(2100, 8, 11), Gender.Female, danya, sonya);
//
//
//        /*
//       1-st wife
//         */
//        System.out.println("1-st wife");
//        danya.setPartner(vika);
//        danya.addChildFromThisPartner(vika, david);
//        danya.addChildFromThisPartner(vika, ari);
//
//       /*
//       3-rd wife
//         */
//        System.out.println("2-nd");
//        danya.setPartner(sonya);
//        danya.addChildFromThisPartner(sonya, hades);
//        danya.addChildFromThisPartner(sonya, mia);
//
//
//        /*
//        Try to use the Service class
//         */
//        Service humanService = new Service<>(Human.class);
//        humanService.addSubjectToFamilyTree(danya, 2);
//        humanService.addSubjectToFamilyTree(sonya,2);
//        humanService.addSubjectToFamilyTree(hades,1);
//        humanService.addSubjectToFamilyTree(david,1);
//        humanService.addSubjectToFamilyTree(ari,2);
//        humanService.addSubjectToFamilyTree(vika,1);
//        humanService.addSubjectToFamilyTree(mia,1);
//
//
//         humanService.addSubjectToFamilyTree("Brizhaty Hades Daniilovich",
//                 LocalDate.of(2026, new Random().nextInt(1, 13), new Random().nextInt(1, 28)),
//                 LocalDate.of(1938, new Random().nextInt(1, 13), new Random().nextInt(1, 28)),
//                 Gender.Male, 3,Human.class);
//         humanService.addSubjectToFamilyTree("Brizhataya Maria Ivanovna",
//                 LocalDate.of(2005, new Random().nextInt(1, 13), new Random().nextInt(1, 28)),
//                 LocalDate.of(2891, new Random().nextInt(1, 13), new Random().nextInt(1, 28)),
//                 Gender.Female, 3,Human.class);
//
//         humanService.readSubjectFromByteCodeFile("Brizhaty Daniil Sergeevich", humanService.findByName("Brizhaty Hades Daniilovich"));
//         humanService.readSubjectFromByteCodeFile("Brizhaty Daniil Sergeevich", humanService.findByName("Brizhataya Maria Ivanovna"));
//
//         Human papaDanya = (Human) humanService.findByName("Brizhaty Hades Daniilovich");
//         if (papaDanya != null) {
//             ((Human) humanService.findByName("Brizhaty Hades Daniilovich")).
//                     setPartner();
//             Object o = humanService.findByName("Brizhataya Maria Ivanovna") != null ?
//                     humanService.findByName("Brizhataya Maria Ivanovna") : null);
//        }
//
//
//         String filePathForTree = "src/family_tree/writer/familyTree.out";
//
//         /*
//         Serialization using ObjectOutputStream class using the service.         Created the method for writing an object as byte code
//          */
//         humanService.initializationFileHandler();
//        humanService.writeTreeAsByteCode(humanService.getFamilyTree(), filePathForTree);
//
//
//        //Renewing of an object from a byte code file using the class ObjectInputStream
//        FamilyTree treeRestored = humanService.readTreeFromByteCodeFile(filePathForTree);
//
//
//        /*
//         Different displaying of methods of sorting using the service (List of Humans or List of Names of Humans)
//         */
//        //ArrayList<Human> sortedByNameFamily = service.getFamilyTree().sortByName();
//        //System.out.println(service.getListOfNames(sortedByNameFamily));
//
//
//        //System.out.println(service.getListOfNames(service.getFamilyTree().sortByAge()));
//
//        System.out.println(("==".repeat(20)));
//        //System.out.println(service.sorting());
//
//        Scanner in = new Scanner(System.in);
//        int request = 0;
//        while ((request < 1) || (request > 3)) {
//            System.out.println("Enter the number of type of sorting (by Name is 1, by Age is 2 or by Date of birth is 3): ");
//            try {
//                request = in.nextInt();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.println(humanService.getFamilyTree());

        ConsoleUI view = new ConsoleUI();
        try {
            view.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}