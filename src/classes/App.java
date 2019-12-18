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
    
    private final List<Journal> listJournal = new ArrayList<>();
    private final List<Person> listPerson = new ArrayList<>();
    private final List<Subject> listSubject = new ArrayList<>();
    private Object journal;
    
    public void run() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Школа ----");
        String repeat = "r";
        int operation;
        do{
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить субъект");
            System.out.println("2. Добавить предмет");
            System.out.println("3. Выставить оценку");
            System.out.println("4. Изменить оценку");
            System.out.println("5. Список оценок");
            
            operation = scanner.nextInt();
            scanner.nextLine();
            switch (operation) {
                
                case 1:
                    
                    PersonBuilding personBuilding = new PersonBuilding();
                    listPerson.add(personBuilding.createPerson());
                    //savable.savePerson(listPersons);
                    for(int i=0; i < listPerson.size();i++){
                       System.out.println(
                            "Добавить субъект: " 
                            + listPerson.get(i).getFirstname()
                        ); 
                    }
                    break;
                    
                case 2:
                    
                    System.out.println("Добавить предмет: ");
                    SubjectBuilding subjectBuilding = new SubjectBuilding();
                    listSubject.add(subjectBuilding.createSubject());
                    //savable.saveSubject(listSubject);
                    break;    
                    
                case 3:
                    
                    JournalBuilding journalBuilding = new JournalBuilding();
                    listJournal.add(journalBuilding.createJournal(listPerson, listSubject ));
                    //savable.saveJournal(listJournsl);
                    for(int i=0;i<listJournal.size();i++){
                       System.out.println(
                               "Выставить оценку: " 
                            + listJournal.get(i).getPerson()
                        ); 
                    }
                    break;
                    
                case 4:
                    
                    System.out.println("Изменить оценку: ");
                    
                    for(int i=0;i<listPerson.size();i++){    
                        System.out.println(listPerson.get(i));
                        
                    }
                    break;
                    
                case 5:
                    
                    for(int i=0;i<listJournal.size();i++){
                        System.out.println(listJournal.get(i));
                    }
                    break;
                    
                
                
                default:
                    System.out.println("Такое действие не поддерживается");
                    continue;
            }
    
            System.out.println("Для продолжения работы введите \"r\"");
            System.out.println("Для завершения работы введите \"q\"");
            repeat = scanner.nextLine();
        }while("r".equals(repeat));
        System.out.println("Программа закончила работу");
    }
    
    /* 
     public void run() {
       Person person = new Person();
        person.setId(1L);
        person.setFirstname("Ilja");
        person.setLastname("Kortsagin");
        person.setStatus("Student");
        System.out.println(person.getId());
        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.getStatus());
        System.out.println("Вывод метода toString(): ");
        System.out.println(person.toString());
    
        Subject subject = new Subject("Programming", 80, "J.Melnikov");
        System.out.println(subject.toString());
}*/
}