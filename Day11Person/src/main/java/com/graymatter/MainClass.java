package com.graymatter;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	        Scanner sc = new Scanner(System.in);
	        PersonDriver driver = new PersonDriver();
	        int choice;

	        do {
	            System.out.println("***************MENU**************");
	            System.out.println("1. Get All Persons");
	            System.out.println("2. Get Person By ID");
	            System.out.println("3. Add Person");
	            System.out.println("4. Update Person");
	            System.out.println("5. Delete Person");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
				    case 1:
				        List<Person> persons = driver.getAllPersonInfo();
				        for (Person person : persons) {
				            System.out.println(person);
				        }
				        break;

				    case 2:
				        System.out.print("Enter person ID: ");
				        int id = sc.nextInt();
				        Person person = driver.getPersonById(id);
				        System.out.println(person != null ? person : "Person not found!");
				        break;

				    case 3:
				        System.out.print("Enter person ID: ");
				        int id1 = sc.nextInt();
				        sc.nextLine(); 
				        System.out.print("Enter person name: ");
				        String name = sc.nextLine();
				        System.out.print("Enter age: ");
				        int age = sc.nextInt();
				        System.out.print("Enter mobile: ");
				        String mobile = sc.next();
				        System.out.print("Enter email: ");
				        String email = sc.next();

				        Person newPerson = new Person(id1, name, age, mobile, email);
				        driver.addPerson(newPerson);
				        System.out.println("Person added to database");
				        break;

				    case 4:
				        System.out.print("Enter person ID  ");
				        int id2 = sc.nextInt();
				        Person personUpdate = driver.getPersonById(id2);

				        if (personUpdate != null) {
				            System.out.print("Enter new name: ");
				            sc.nextLine(); 
				            String updateName = sc.nextLine();
				            System.out.print("Enter new age: ");
				            int updateAge = sc.nextInt();
				            System.out.print("Enter new mobile: ");
				            String updateMobile = sc.next();
				            System.out.print("Enter new email: ");
				            String updateEmail = sc.next();

				            Person updatedPerson = new Person(id2, updateName, updateAge, updateMobile, updateEmail);
				            driver.updatePerson(updatedPerson, id2);
				            System.out.println("Person updated ");
				        } else {
				            System.out.println("Person not found!");
				        }
				        break;

				    case 5:
				        System.out.print("Enter person ID  ");
				        int id3 = sc.nextInt();
				        Person deletePerson = driver.deletePerson(id3);
				        System.out.println(deletePerson != null ? "Deleted: " + deletePerson : "Person not found!");
				        break;

				    case 6:
				        System.out.println("---------------------");
				        break;

				    default:
				        System.out.println("Invalid choice. ");
				        break;
				}

	        } while (choice != 6);

	        
	    }
	}



