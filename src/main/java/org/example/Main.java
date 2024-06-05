package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Juliet", "Sellers"));
        employees.add(new Employee(2, "Raina", "Singleton"));
        employees.add(new Employee(3, "Anika", "Williamson"));
        employees.add(new Employee(4, "Angelina", "Fleming"));
        employees.add(new Employee(5, "Nylah", "Haynes"));
        employees.add(new Employee(6, "Gary", "Warner"));
        employees.add(new Employee(3, "Anika", "Williamson"));
        employees.add(new Employee(4, "Angelina", "Fleming"));
    }

    public static List<Employee> findDuplicates(List list) {
        List<Employee> duplicate = new ArrayList<>();
        Set<Employee> unique = new HashSet<>();
        for (Object employee : list) {
            if (!unique.add((Employee) employee)) {
                duplicate.add((Employee) employee);
            }
        }
    return duplicate;
    }

    public static Map<Integer, Employee>  findUniques(List<Employee>  list){
        Map<Integer, Employee> unique = new HashMap<>();
        for (Employee emp : list) {
            if (emp == null) {
                System.out.println("null");
                continue;
            }
            if (!unique.containsKey(emp.getId())) {
                unique.put(emp.getId(), emp);
            }
        }
        return unique;
    }

    public static List<Employee>  removeDuplicates(List<Employee>  list){
        List<Employee> duplicates = findDuplicates(list);
        Map<Integer, Employee> unique = findUniques(list);

        List<Employee> uniques = new LinkedList<>(unique.values());
        uniques.removeAll(duplicates);
        return uniques;

    }


}