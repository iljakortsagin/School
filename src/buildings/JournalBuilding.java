/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildings;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JournalBuilding {
    
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private final Scanner scanner = new Scanner(System.in);
    
    public Journal createJournal(List<Person> listPerson, List<Subject> listSubject) {    
    
        Journal journal = new Journal();
        System.out.println("-------Создание журнала--------");               
        System.out.println("Cпиок студентов: ");
        int n = 1;
        for (Person person : listPerson) {
            if("student".equals(person.getStatus())){
            System.out.print("Студент: "+n+". "+person.getFirstname()+" "+person.getLastname());
            n++;
        }
        }
        System.out.println("Cпиок предметов: ");
        n = 1;
        for (Subject subject : listSubject) {
            System.out.print("Предмет: "+n+". "+subject.getName());
            n++;
        }
            
        System.out.println("Выберите студента:");
        int numStudent = (scanner.nextInt());
        journal.setPerson(listPerson.get(numStudent-1));
        
        System.out.print("Предмет: ");
        int subjectNum = (scanner.nextInt());
        journal.setSubject(listSubject.get(subjectNum-1));
        
        System.out.print("Оценка: ");
        int grade = scanner.nextInt();
        journal.setGrade(grade);
        
        Date date = new Date();
        System.out.println(sdf.format(date));
        journal.setDate(date);
        return journal;
         
        }
    
    }


