

package classes;

import entity.Person;
import entity.Subject;
import entity.Journal;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SavingFile {
    
    private FileOutputStream fileOut = null;
    private ObjectOutputStream objOut = null;
    FileInputStream fileIn = null;
    ObjectInputStream objIn = null;
    
    public void savePersons(List<Person> listPersons){
        try {
            fileOut = new FileOutputStream("Persons.txt");
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(listPersons);
            objOut.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден. Ошибка: " + ex);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода. Ошибка: " + ex);
        }finally {
            try {
                objOut.close();
                fileOut.close();
            } catch (IOException ex) {
                System.out.println("Ресурсы освободить не удалось: "+ex);
            }
        }
    }
    
    public void saveSubjects(List<Subject> listSubjects){
        try {
            fileOut = new FileOutputStream("Subjects.txt");
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(listSubjects);
            objOut.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден. Ошибка: " + ex);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода. Ошибка: " + ex);
        }finally {
            try {
                objOut.close();
                fileOut.close();
            } catch (IOException ex) {
                System.out.println("Ресурсы освободить не удалось: "+ex);
            }
        }
    }
    
    public void saveJournals(List<Journal> listJournals){
        try {
            fileOut = new FileOutputStream("Journals.txt");
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(listJournals);
            objOut.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден. Ошибка: " + ex);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода/вывода. Ошибка: " + ex);
        }finally {
            try {
                objOut.close();
                fileOut.close();
            } catch (IOException ex) {
                System.out.println("Ресурсы освободить не удалось: "+ex);
            }
        }
    }
    
    public List<Person> loadPersons(){
        List<Person> listPersons = new ArrayList<>();
        try {
            fileIn = new FileInputStream("Persons.txt");
            objIn = new ObjectInputStream(fileIn);
            listPersons =(List<Person>) objIn.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден. Ошибка: "+ ex);
        } catch (IOException ex) {
            System.out.println("Файл не прочитан. Ошибка: "+ ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс: "+ ex);
        } finally {
            try {
               if(fileIn != null){
                  fileIn.close();
               }
               if(objIn !=null){
                  objIn.close();
               }
            } catch (IOException ex) {
               System.out.println("Ресурсы освободить не удалось: "+ex);
            }
        }
        return listPersons;
    }
    
    public List<Subject> loadSubjects(){
        List<Subject> listSubjects = new ArrayList<>();
        try {
            fileIn = new FileInputStream("Subjects.txt");
            objIn = new ObjectInputStream(fileIn);
            listSubjects =(List<Subject>) objIn.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден. Ошибка: "+ ex);
        } catch (IOException ex) {
            System.out.println("Файл не прочитан. Ошибка: "+ ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс: "+ ex);
        } finally {
            try {
               if(fileIn != null){
                  fileIn.close();
               }
               if(objIn !=null){
                  objIn.close();
               }
            } catch (IOException ex) {
               System.out.println("Ресурсы освободить не удалось: "+ex);
            }
        }
        return listSubjects;
    }
    
    public List<Journal> loadJournals(){
        List<Journal> listJournals = new ArrayList<>();
        try {
            fileIn = new FileInputStream("Journals.txt");
            objIn = new ObjectInputStream(fileIn);
            listJournals =(List<Journal>) objIn.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден. Ошибка: "+ ex);
        } catch (IOException ex) {
            System.out.println("Файл не прочитан. Ошибка: "+ ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Не найден класс: "+ ex);
        } finally {
            try {
               if(fileIn != null){
                  fileIn.close();
               }
               if(objIn !=null){
                  objIn.close();
               }
            } catch (IOException ex) {
               System.out.println("Ресурсы освободить не удалось: "+ex);
            }
        }
        return listJournals;
    }
    
}
