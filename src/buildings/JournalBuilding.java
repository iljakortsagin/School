/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildings;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JournalBuilding {
    
    private Journal journal = new Journal();
    private final Scanner scanner = new Scanner(System.in);
    
    public Journal createJournal(List<Person> listPersons, List<Subject> listSubjects) {    
    
        System.out.println("-------:Журнал--------");               
        System.out.println("Cписок студентов: ");
        
        for(int i=0;i<listPersons.size();i++){
            System.out.printf("%d. Имя: %s. Фамилия: %s%n"
                    ,i+1
                    ,listPersons.get(i).getFirstname()
                    ,listPersons.get(i).getLastname()
                   // ,listPersons.get(i).getStatus()
            );
        
        }
        System.out.println("Cписок предметов: ");
        
        for(int i=0;i<listSubjects.size();i++){
            System.out.printf("%d. %s %s%n"
                    ,i+1
                    ,listSubjects.get(i).getId()
                    ,listSubjects.get(i).getName()
            );
        
        }
            
        System.out.println("Выберите студента:");
        int numStudent = (scanner.nextInt());
        journal.setPerson(listPersons.get(numStudent-1));
        
        System.out.print("Предмет: ");
        int subjectNum = (scanner.nextInt());
        journal.setSubject(listSubjects.get(subjectNum-1));
        
        System.out.print("Оценка: ");
        int grade = scanner.nextInt();
        journal.setGrade(grade);
        
        journal.setDate(new Date());
        
       // Date date = new Date();
       // System.out.println(sdf.format(date));
       // journal.setDate(date);
        return journal;

         
        }
    
    
    public void changeJournal(List<Journal> journals){
        System.out.println("------- Исправить оценку -------");
        System.out.println("Список оценок:");
        boolean flag = false;
        for(int i=0;i<journals.size();i++){
            if(journals.get(i).getReturnDate() == null){
                System.out.printf("%d. Предмет: %s. Студент: %s %s%n"
                        ,i+1
                        ,journals.get(i).getSubject().getName()
                        ,journals.get(i).getPerson().getFirstname()
                        ,journals.get(i).getPerson().getLastname()
                       // ,journals.get(i).getJournal().getGrade()
                );
                flag = true;
            }
            
        }
        
        if(flag){
            System.out.print("Выберите номер записи: ");
            int numJournal = scanner.nextInt();
            journals.get(numJournal - 1).setReturnDate(new Date());
            
            
            
            System.out.println("Оценка изменена.");
        }else{
            System.out.println("Не удалось.");
        }
        
        
    }
    
    }


