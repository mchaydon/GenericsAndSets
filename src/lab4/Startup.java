/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import lab3.*;
import lab2.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mike
 */
public class Startup {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("Smith", "John", "123-35-1234"));
        employeeSet.add(new Employee("Jones", "Robert", "123-35-1234"));
        employeeSet.add(new Employee("Als", "Sally", "333-12-1956"));
        employeeSet.add(new Employee("Thompson", "Kelly", "762-09-0064"));
        
        //Can not retrieve an index of a set.
        //System.out.println(employeeSet.get(3));
        
        /*Because we do not a have a way to retrieve the index, we can not use 
        the old style for loop.
        System.out.println("\nFirst Loop");
        
        for (int i = 0; i < employeeSet.size(); i++){
            Employee e = employeeSet.get(i);
            System.out.println(e);
        }*/
        
        System.out.println("\nFirst Loop");
        
        for (Employee employee : employeeSet){
            Employee e = employee;
            System.out.println(e);
        }
        
        /*System.out.println("\nList length before removal: " + employeeSet.size());
        for (Employee employee : employeeSet){
            Employee e = employee;
            System.out.println(e);
        }
        System.out.println("List length after removal: " + employeeSet.size());*/
        
        
        System.out.println("\nList length before adding: " + employeeSet.size());
        employeeSet.add(new Employee("Hanson", "Hank", "456-03-0982"));
        for (Employee employee : employeeSet){
            Employee e = employee;
            System.out.println(e);
        }
        System.out.println("List length after adding: " + employeeSet.size());
        
        /*System.out.println("\nReplacing employee 3");
        //employeeSet.set(2, new Employee("Johnson", "Frank", "456-03-0322"));
        for (Employee employee : employeeSet){
            Employee e = employee;
            System.out.println(e);
        }*/
    }
}
