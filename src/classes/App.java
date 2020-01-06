/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import buildings.JournalBuilding;
import buildings.PersonBuilding;
import buildings.SubjectBuilding;
import entity.Person;
import entity.Subject;
import entity.Journal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class App {
    
    List<Person> listPersons = new ArrayList<>();
    List<Subject> listSubjects = new ArrayList<>();
    List<Journal> listJournals = new ArrayList<>();
    SavingFile savingFile = new SavingFile();

    public App() {
        listPersons.addAll(savingFile.loadListPersons());
        listSubjects.addAll(savingFile.loadListSubjects());
        listJournals.addAll(savingFile.loadListJournals());
    }
    
    public void run() {
        
        Scanner scanner = new Scanner(System.in);
        String operation = "0";
        boolean badOperation;
        
        JournalBuilding journalBuilding = new JournalBuilding();
        
        do{
        
       // System.out.println("---- Школа ----");
       // String repeat = "r";
       // int operation;
        do{
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить субъект");
            System.out.println("2. Добавить предмет");
            System.out.println("3. Выставить оценку");
            System.out.println("4. Изменить оценку");
            System.out.println("5. Список оценок");
            
            /*operation = scanner.nextInt();
            scanner.nextLine();
            switch (operation) {*/
            
            badOperation = false;
            operation = scanner.next();
            switch (operation) {
                    case "0":
                        badOperation = false;
                        break;
                
                    case "1":
                    
                    PersonBuilding personBuilding = new PersonBuilding();
                    Person person = personBuilding.createPerson();
                    //listPerson.add(personBuilding.createPerson());
                    //savable.savePerson(listPersons);
                    
                    if(person == null){
                            System.out.println("Субъект создать не удалось.");
                        }else{
                            listPersons.add(person);
                            savingFile.savePersons(listPersons);
                            System.out.println("Добавлен новый субъект.");
                        }
                        break;
                    
                    /*for(int i=0; i < listPerson.size();i++){
                       System.out.println(
                            "Добавить субъект: " 
                            + listPerson.get(i).getFirstname()
                        ); 
                    }
                    break;*/
                    
                case "2":
                    
                    SubjectBuilding subjectBuilding = new SubjectBuilding();
                    Subject subject = subjectBuilding.createSubject();
                    
                    if(subject == null){
                            System.out.println("Предмет создать не удалось.");
                        }else{
                            listSubjects.add(subject);
                            savingFile.saveSubjects(listSubjects);
                            System.out.println("Добавлен новый предмет.");
                        }               
                    
                   /* System.out.println("Добавить предмет: ");
                    SubjectBuilding subjectBuilding = new SubjectBuilding();
                    listSubject.add(subjectBuilding.createSubject());
                    //savable.saveSubject(listSubject);*/
                    break;  
                    
                case "3":
                    
                    Journal journal = journalBuilding.createJournal();
                    
                    if(journal == null){
                            System.out.println("Не удалось выставить оценку.");
                        }else{
                            listJournals.add(journal);
                            savingFile.saveJournals(listJournals);
                            System.out.println("Оценка выставлена.");
                        }                
                    
                   /* JournalBuilding journalBuilding = new JournalBuilding();
                    listJournal.add(journalBuilding.createJournal(listPerson, listSubject ));
                    //savable.saveJournal(listJournsl);
                    for(int i=0;i<listJournal.size();i++){
                       System.out.println(
                               "Выставить оценку: " 
                            + listJournal.get(i).getPerson()
                        ); 
                    }*/
                    break;
                    
                case "4":
                    
                    journalBuilding.changeJournal(listJournals);
                    savingFile.saveJournals(listJournals);
                    System.out.println("Оценка исправлена.");
                    
                    /*System.out.println("Изменить оценку: ");
                    
                    for(int i=0;i<listPerson.size();i++){    
                        System.out.println(listPerson.get(i));
                        
                    }*/
                    break;
                    
                case "5":
                    
                    System.out.println("---- Список оценок ----");
                        for(Journal j : listJournals){
                            System.out.println(j.toString());
                        }
                    
                    /*for(int i=0;i<listJournal.size();i++){
                        System.out.println(listJournal.get(i));
                    }*/
                    break;
                    
                 default:
                        System.out.println("Неправильная операция!");
                        System.out.println("Выберите правильную операцию");
                        badOperation = true;
                }
            }while(badOperation);
            if(operation.equals("0"))break;
            
        }while(true);
                
               /* default:
                    System.out.println("Такое действие не поддерживается");
                    continue;
            }
    
            System.out.println("Для продолжения работы введите \"r\"");
            System.out.println("Для завершения работы введите \"q\"");
            repeat = scanner.nextLine();
        }while("r".equals(repeat));
        System.out.println("Программа закончила работу");
    }*/
        
}
}
