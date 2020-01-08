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
        listPersons.addAll(savingFile.loadPersons());
        listSubjects.addAll(savingFile.loadSubjects());
        listJournals.addAll(savingFile.loadJournals());
    }
    
    public void run() {
        
        Scanner scanner = new Scanner(System.in);
        String operation = "0";
        boolean badOperation;
        
        JournalBuilding journalBuilding = new JournalBuilding();
        
        do{
        
            do{
                System.out.println("Выберите действие:");
                System.out.println("0. Выход");
                System.out.println("1. Добавить субъект");
                System.out.println("2. Добавить предмет");
                System.out.println("3. Выставить оценку");
                System.out.println("4. Изменить оценку");
                System.out.println("5. Список оценок");

                badOperation = false;
                operation = scanner.next();
                switch (operation) {
                        case "0":
                            badOperation = false;
                            break;

                        case "1":

                        PersonBuilding personBuilding = new PersonBuilding();
                        Person person = personBuilding.createPerson();

                        if(person == null){
                                System.out.println("Субъект создать не удалось.");
                            }else{
                                listPersons.add(person);
                                savingFile.savePersons(listPersons);
                                System.out.println("Добавлен новый субъект.");
                            }
                            break;

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

                        break;  

                    case "3":

                        Journal journal = journalBuilding.createJournal(listPersons,listSubjects);

                        if(journal == null){
                                System.out.println("Не удалось выставить оценку.");
                            }else{
                                listJournals.add(journal);
                                savingFile.saveJournals(listJournals);
                                System.out.println("Оценка выставлена.");
                            }                

                        break;

                    case "4":

                        journalBuilding.changeJournal(listJournals);
                        savingFile.saveJournals(listJournals);
                        System.out.println("Оценка исправлена.");

                        break;

                    case "5":

                        System.out.println("---- Список оценок ----");
                            for(Journal j : listJournals){
                                System.out.println(j.toString());
                            }

                        break;

                     default:
                            System.out.println("Неправильная операция!");
                            System.out.println("Выберите правильную операцию");
                            badOperation = true;
                    }
                }while(badOperation);
                if(operation.equals("0"))break;

            }while(true);

    }
    }
