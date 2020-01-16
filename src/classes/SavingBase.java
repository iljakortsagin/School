/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Person;
import entity.Subject;
import entity.Journal;
import interfaces.Inclusive;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
/**
 *
 * @author pupil
 */
public class SavingBase implements Inclusive{
    EntityManager em;
    EntityTransaction et;
    
     public SavingBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("School");
        this.em = emf.createEntityManager();
        this.et = em.getTransaction();
    }
     
    @Override
    public void savePersons(List<Person> listPersons) {
        for(Person person : listPersons){
            et.begin();
                em.persist(person);
            et.commit();
        } 
    }
    
    @Override
    public void saveSubjects(List<Subject> listSubjects) {
        for(Subject subject : listSubjects){
            et.begin();
                em.persist(subject);
            et.commit();
        } 
    }
    
    @Override
    public void saveJournals(List<Journal> listJournals) {
        for(Journal journal : listJournals){
            et.begin();
                em.persist(journal);
            et.commit();
        } 
    }
    
    @Override
    public List<Person> loadListPersons() {
        return em.createQuery("SELECT prsn FROM Person prsn")
                .getResultList();
    }

    @Override
    public List<Subject> loadListSubjects() {
        return em.createQuery("SELECT sbjct FROM Subject sbjct")
                .getResultList();
    }

    @Override
    public List<Journal> loadListJournals() {
        return em.createQuery("SELECT jrnl FROM Journal jrnl")
                .getResultList();
    }
}
