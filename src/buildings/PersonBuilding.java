/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildings;

import entity.Person;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class PersonBuilding {
    
    public Person createPerson() {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------Новый субъект--------");
        
        System.out.print("Имя субъекта: ");
        person.setFirstname(scanner.nextLine());
        System.out.print("Фамилия субъекта: ");
        person.setLastname(scanner.nextLine());
        System.out.print("Статус субъекта: ");
        person.setStatus(scanner.nextLine());
        
        return person;
    
    }
}
