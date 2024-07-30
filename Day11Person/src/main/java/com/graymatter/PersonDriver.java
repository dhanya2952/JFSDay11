package com.graymatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDriver {
	
	
	DBConnection dbc= new DBConnection();
	
	
	
	public List<Person> getAllPersonInfo() throws ClassNotFoundException 
	{
		String query="select * from Person";
		Connection con;
		ArrayList<Person> pList=new ArrayList<Person>();
		try {
			con = dbc.getConnection();
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery(query);
			
			while(rs.next())
				pList.add(new Person(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pList;
	
	}
	
	public Person getPersonById(int id) throws ClassNotFoundException, SQLException 
	{
		String query = "select * from Person where person_id=?";
	    Connection con;
	    Person person = null;
		con = dbc.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		
		if (rs.next()) 
		    person = new Person(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
	    
		return person;
		
	}
	
	public Person addPerson(Person person) throws ClassNotFoundException, SQLException 
	{
		String query="Insert into Person(person_id,person_name,age,mobile,email) Values(?,?,?,?,?)";
		Connection con;
		con = dbc.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, person.getId());
		pst.setString(2,person.getName());
		pst.setInt(3, person.getAge());
		pst.setString(4, person.getMobile());
		pst.setString(5, person.getEmail());
		pst.executeUpdate();
	    
	    return person;
	    //return "Person with ID " + id + " has been updated successfully.";
		
	}
	public Person updatePerson(Person person, int id) throws ClassNotFoundException, SQLException 
	{
		String query = "UPDATE person SET age = ?, person_name = ?, mobile = ?, email = ? WHERE person_id = ?";
		Connection con;
		con = dbc.getConnection();
		PreparedStatement pm = con.prepareStatement(query);
		pm.setInt(1, person.getAge());
		pm.setString(2, person.getName());
		pm.setString(3, person.getMobile());
		pm.setString(4, person.getEmail());
		pm.setInt(5, id);

		pm.executeUpdate();
                   
        return person;
        
		
	}
	public Person deletePerson(int id) throws ClassNotFoundException, SQLException 
	{
		Person per=getPersonById(id);
		Connection con;
		con = dbc.getConnection();
		if(per!=null)
		{
			String query = "DELETE FROM Person WHERE person_id = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			pst.executeUpdate();
			return per;
		}
		
		
			return null;
		
	}

}
