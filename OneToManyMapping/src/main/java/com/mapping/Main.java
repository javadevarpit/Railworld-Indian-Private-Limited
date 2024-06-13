package com.mapping;
import com.mapping.models.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Arrays;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
        EntityManager em = emf.createEntityManager();

//         Create User
        Department user = new Department();
        Employees employees = new Employees();
//        user.setId(1L);
        user.setName("Arpit");
        employees.setName("Ayushi");
        user.setEmployees(Arrays.asList(employees));


        // Persist User
        em.getTransaction().begin();
        em.persist(user);
        em.persist(employees);
        //emp.persist(emp);
        em.getTransaction().commit();
//
        // Find User
//        Users foundUser = em.find(Users.class, user.getId());
//        System.out.println("User found: " + foundUser.getName());
////
//        // Update User
//        em.getTransaction().begin();
//        foundUser.setName("John Smith");
//        em.getTransaction().commit();
//        System.out.println("Updated User Name: " + foundUser.getName());
//
//        // Delete User
//        em.getTransaction().begin();
//        em.remove(foundUser);
//        em.getTransaction().commit();
//        System.out.println("User deleted.");
//
        em.close();
        emf.close();

    }
}