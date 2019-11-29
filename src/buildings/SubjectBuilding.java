/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildings;

import entity.Subject;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class SubjectBuilding {
    
        public Subject createSubject() {
        Subject subject = new Subject();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------Создание предмета--------");
        
        int setID;
            setID = (scanner.nextInt());
        System.out.print("Имя предмета: ");
        subject.setName(scanner.nextLine());
        System.out.print("Количество часов: ");
        int setHours;
            setHours = (scanner.nextInt());
        System.out.print("Преподаватель: ");
        subject.setPerson(scanner.nextLine());
        
        return subject;
    
    }

    /*public Subject createSubject(List<Subject> listSubject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public Subject createSubject(List<Subject> listSubject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
