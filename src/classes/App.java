/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Person;
import entity.Subject;
import entity.Journal;
import java.util.Date;
/**
 *
 * @author pupil
 */
public class App {
    /*List<Person> listPersons;
    List<Subject> listSubjects;
    List<Journal> listJournals;
    SaverToFile saverToFile;
    
     public App() {
        listPersons = new ArrayList<>();
        listSubjects = new ArrayList<>();
        listJournals = new ArrayList<>();
        saverToFile = new SaverToFile();
        listPersons.addAll(saverToFile.loadListPersons());
        listSubjects.addAll(saverToFile.loadListSubjects());
        listJournals.addAll(saverToFile.loadListJournals());
    }*/
     
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
    
}
}