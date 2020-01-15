/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author pupil
 */
@Entity
public class Journal implements Serializable{
    
    private Long id;
    private Person person;
    private Subject subject;
    private int grade;
    private Date date;
    private Date changedate;
    
    public Journal() {
    }

    public Journal(Person person, Subject subject, int gradeValue, Date date, Date changedate) {
        this.person = person;
        this.subject = subject;
        this.grade = gradeValue;
        this.date = date;
        this.changedate = changedate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public Date getChangeDate() {
        return changedate;
    }

    public void setChangeDate(Date changedate) {
        this.changedate = changedate;
    }

    @Override
    public String toString() {
        
        if(changedate == null){
            return "Journal{" + "id=" + id 
                + ", person=" + person.getFirstname()
                + " " + person.getLastname()   
                + ", subject=" + subject.getName()
                + ", grade=" + grade
                + ", date=" + date 
                 
                + '}';
        }else{
           return "Journal{" + "id=" + id 
                + ", person=" + person.getFirstname()
                + " " + person.getLastname()   
                + ", subject=" + subject.getName()
                + ", grade=" + grade
                + ", date=" + date 
                + ", changedate=" + changedate   
                   
                + '}';
        }
        
        //return "Journal{" + "id=" + id + ", person=" + person + ", subject=" + subject + ", Grade Value=" + grade + ", date=" + date + '}';
        
    }

    /*public Object getReturnDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setReturnDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getJournal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
