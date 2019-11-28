/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Subject {
    
   private Long id;
   private String name; 
   private int hours;
   private String person;

    public Subject() {
    }

    public Subject(String name, int hours, String person) {
        this.name = name;
        this.hours = hours;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", name=" + name + ", hours=" + hours + ", person=" + person + '}';
    }
    
}
