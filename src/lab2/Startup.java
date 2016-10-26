/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mike
 */
public class Startup {
    public static void main(String[] args) {
        List employeeList = new ArrayList();
        employeeList.add(new Employee("Smith", "John", "123-35-1234"));
        employeeList.add(new Employee("Jones", "Robert", "123-35-1234"));
        employeeList.add(new Employee("Als", "Sally", "333-12-1956"));
        employeeList.add(new Employee("Thompson", "Kelly", "762-09-0064"));
        
        System.out.println(employeeList.get(3));
        
        System.out.println("\nFirst Loop");
        
        for (int i = 0; i < employeeList.size(); i++){
            Employee e = (Employee)employeeList.get(i);
            System.out.println(e);
        }
        
        System.out.println("\nSecond Loop");
        
        for (Object employee : employeeList){
            Employee e = (Employee)employee;
            System.out.println(e);
        }
        
        System.out.println("\nList length before removal: " + employeeList.size());
        employeeList.remove(3);
        for (Object employee : employeeList){
            Employee e = (Employee)employee;
            System.out.println(e);
        }
        System.out.println("List length after removal: " + employeeList.size());
        
        
        System.out.println("\nList length before adding: " + employeeList.size());
        employeeList.add(1, new Employee("Hanson", "Hank", "456-03-0982"));
        for (Object employee : employeeList){
            Employee e = (Employee)employee;
            System.out.println(e);
        }
        System.out.println("List length after adding: " + employeeList.size());
        
        System.out.println("\nReplacing employee 3");
        employeeList.set(2, new Employee("Johnson", "Frank", "456-03-0322"));
        for (Object employee : employeeList){
            Employee e = (Employee)employee;
            System.out.println(e);
        }
    }
}
