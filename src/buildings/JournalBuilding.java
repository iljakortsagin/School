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
    private Journal journal = new Journal();
    private final Scanner scanner = new Scanner(System.in);
    
    public Journal createJournal(List<Person> listPerson, List<Subject> listSubject) {    
    
        System.out.println("-------:Журнал--------");               
        System.out.println("Cписок студентов: ");
        int n = 1;
        for (Person person : listPerson) {
            if("student".equals(person.getStatus())){
            System.out.print("Студент "+n+". "+person.getFirstname()+" "+person.getLastname()+ "\n");
            n++;
        }
        }
        System.out.println("Cписок предметов: ");
        n = 1;
        for (Subject subject : listSubject) {
            System.out.print("Предмет "+n+". "+subject.getName()+ "\n");
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

    public Journal changeJournal(List<Person> listPerson, List<Subject> listSubject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Journal createJournal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }


