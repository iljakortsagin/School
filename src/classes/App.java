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
import interfaces.Inclusive;
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
    Inclusive inclusive = new SavingBase();
    public App() {
        listPersons.addAll(inclusive.loadListPersons());
        listSubjects.addAll(inclusive.loadListSubjects());
        listJournals.addAll(inclusive.loadListJournals());
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String operation = "";
        boolean repeat;
        JournalBuilding journalBuilding = new JournalBuilding();
        do{
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Добавить предмет");
            System.out.println("3. Выставить оценку");
            System.out.println("4. Изменить оценку");
            System.out.println("5. Список студентов");
            System.out.println("6. Список предметов");
            System.out.println("7. Список оценок");
            System.out.println("0. Выход");
            
            repeat = true;
            operation = scanner.nextLine();
            switch (operation) {
                case "0":
                    repeat = false;
                    break;
                case "1":
                    PersonBuilding personBuilding = new PersonBuilding();
                    Person person = personBuilding.createPerson();

                    if(person == null){
                        System.out.println("Студента добавить не удалось.");
                    }else{
                        listPersons.add(person);
                        inclusive.savePersons(listPersons);
                        System.out.println("Добавлен новый студент.");
                    }
                    break;
                case "2":
                    SubjectBuilding subjectBuilding = new SubjectBuilding();
                    Subject subject = subjectBuilding.createSubject();
                    if(subject == null){
                        System.out.println("Предмет создать не удалось.");
                    }else{
                        listSubjects.add(subject);
                        inclusive.saveSubjects(listSubjects);
                        System.out.println("Добавлен новый предмет.");
                    }               
                    break;  
                case "3":
                    Journal journal = journalBuilding.createJournal(listPersons,listSubjects);
                    if(journal == null){
                        System.out.println("Не удалось выставить оценку.");
                    }else{
                        listJournals.add(journal);
                        inclusive.saveJournals(listJournals);
                        System.out.println("Оценка выставлена.");
                    }                
                    break;
                case "4":
                    journalBuilding.changeJournal(listJournals);
                    inclusive.saveJournals(listJournals);
                    //System.out.println("Оценка исправлена.");
                    break;
                case "5":
                    System.out.println("---- Список студентов ----");
                    for(Person prsn : listPersons){
                        System.out.println(prsn.toString());
                    } 
                    break;
                case "6":
                    System.out.println("---- Список предметов ----");
                    for(Subject sbjct : listSubjects){
                        System.out.println(sbjct.toString());
                    }
                    break;      
                case "7":
                    System.out.println("---- Список оценок ----");
                    for(Journal jrnl : listJournals){
                        System.out.println(jrnl.toString());
                    }
                    break;
                
                default:
                    System.out.println("Неправильная операция!");
                    System.out.println("Выберите правильную операцию");
                }
        }while(repeat);

      }
    }
