/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Person;
import entity.Subject;
import entity.Journal;
import java.util.List;

/**
 *
 * @author pupil
 */
public interface Inclusive {
    
    public void savePersons(List<Person> listPersons);
    public void saveSubjects(List<Subject> listSubjects);
    public void saveJournals(List<Journal> listJournals);
    public List<Person> loadListPersons();
    public List<Subject> loadListSubjects();
    public List<Journal> loadListJournals();
    
}
