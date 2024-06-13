package com.mapping;

import com.mapping.models.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
        EntityManager em = emf.createEntityManager();

//         Create User
        Person user = new Person();
        Passport passport= new Passport();
//        user.setId(1L);
        user.setName("John Doe");

        passport.setPassportNumber("1234");
        user.setPassport(passport);
//        user.setEmail("john.doe@example.com");
        em.getTransaction().begin();
        em.persist(user );
        em.persist(passport);
        em.getTransaction().commit();


//        passport.setId(1L);



//        em.getTransaction().begin();
//        em.persist(passport);
//        em.getTransaction().commit();


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
