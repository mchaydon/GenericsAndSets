/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import lab3.*;
import lab2.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Mike
 */
public class Startup {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Smith", "John", "123-35-1234"));
        employeeList.add(new Employee("Jones", "Robert", "123-35-1234"));
        employeeList.add(new Employee("Als", "Sally", "333-12-1956"));
        employeeList.add(new Employee("Thompson", "Kelly", "762-09-0064"));
        
        System.out.println("Loop through the list before removing duplicates");
        for (Employee employee : employeeList){
            Employee e = employee;
            System.out.println(e);
        }
        
        Set<Employee> employeeSet = new HashSet<>(employeeList);
        
        System.out.println("\nLoop through the set to verify duplicates have been "
                + "removed");
        for (Employee employee : employeeSet){
            Employee e = employee;
            System.out.println(e);
        }
        
        employeeList.clear();
        employeeList.addAll(employeeSet);
        System.out.println("\nLoop through the list to verify duplicates have been "
                + "removed");
        for (Employee employee : employeeList){
            Employee e = employee;
            System.out.println(e);
        }
    }
}
