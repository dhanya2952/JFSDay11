package com.graymatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

public class PersonTest 
{

	private PersonDriver driver;
	//private Person person;
	
	@Test
    public void testAddPerson() throws ClassNotFoundException, SQLException {
        Person person = new Person(11, "asd", 30, "1234567890", "asd@gmail.com");
        Person newPerson = driver.addPerson(person);
        
        assertNotNull(newPerson);
        assertEquals(person.getId(), newPerson.getId());
        assertEquals(person.getName(), newPerson.getName());
    }
	
	@Test
    public void testGetPersonById() throws ClassNotFoundException, SQLException {
        
        Person person = new Person(2, "iop", 25, "0987654321", "iop@gmail.com");
        driver.addPerson(person);
        
        
        Person newPerson = driver.getPersonById(2);
        
        assertNotNull(newPerson);
        assertEquals(person.getId(), newPerson.getId());
        assertEquals(person.getName(), newPerson.getName());
    }

    @Test
    public void testGetAllPersonInfo() throws ClassNotFoundException, SQLException {
        
        driver.addPerson(new Person(3, "ert", 28, "1112223333", "ert@gmail.com"));
        driver.addPerson(new Person(4, "dfg", 35, "4445556666", "dfg@gmail.com"));
        
        
        List<Person> persons = driver.getAllPersonInfo();
        
        assertNotNull(persons);
        assertTrue(persons.size() >= 2); 
    }

    @Test
    public void testUpdatePerson() throws ClassNotFoundException, SQLException {
        
        Person person = new Person(5, "cvb", 40, "7778889999", "cvb@gmail.com");
        driver.addPerson(person);
        
        person.setName("Charlie Brown");
        person.setAge(41);
        driver.updatePerson(person, person.getId());
        
        
        Person newPerson = driver.getPersonById(5);
        
        assertNotNull(newPerson);
        assertEquals("cvb", newPerson.getName());
        assertEquals(41, newPerson.getAge());
    }

    @Test
    public void testDeletePerson() throws ClassNotFoundException, SQLException {
        
        Person person = new Person(6, "jkl", 29, "9998887777", "jkl@gmail.com");
        driver.addPerson(person);
        
        Person deletedPerson = driver.deletePerson(6);
        
        assertNotNull(deletedPerson);
        assertEquals(person.getId(), deletedPerson.getId());
        
        Person retrievedPerson = driver.getPersonById(6);
        assertNull(retrievedPerson);
    }
}
