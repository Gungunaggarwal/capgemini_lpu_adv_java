package com.practice;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
public class Demo {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
	
	
}
}
