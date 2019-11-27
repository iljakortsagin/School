/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Person;
import entity.Subject;
import entity.Journal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class App {
    List<Person> listPersons;
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
    }
     
     public void run() {
        Scanner scanner = new Scanner(System.in);
        String operation = "0";
        boolean badOperation;
    
}
}