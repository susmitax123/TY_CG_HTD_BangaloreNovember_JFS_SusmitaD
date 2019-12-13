package com.capgemini.contactapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.contactapp.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO{
	FileReader reader;
	Properties prop;
	ContactBean contactBean;
	
	public ContactDAOImpl() {
		try {
			reader = new FileReader("db.properties.txt");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
		

	@Override
	public boolean deleteContact(String name) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))
				
						){
							pstmt.setString(1, name);
							int count = pstmt.executeUpdate();
							
							if(count > 0) {
								return true;
							}
			
		}catch (Exception e) {
				e.printStackTrace();
			}
		return false;
	}



	@Override
	public boolean addContact(ContactBean contact) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"))
						){
		pstmt.setString(1, contactBean.getName());
		pstmt.setInt(2, contactBean.getNumber());
		pstmt.setString(3, contactBean.getGroup1());

		
		int count = pstmt.executeUpdate();
		
		if(count > 0) {
			return true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}

		return false;
	}



	@Override
	public List<ContactBean> getAllContact() {
		List<ContactBean> list = new ArrayList<ContactBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query"))
						){
			while(rs.next()) {
				contactBean = new ContactBean();
				contactBean.setName(rs.getString(1));
				contactBean.setNumber(rs.getInt(2));
				contactBean.setGroup1(rs.getString(3));
				
				
				list.add(contactBean);
			}
			return list;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean search(String name) {
		
		return false;
	}

	@Override
	public boolean updateContact(ContactBean contact) {
	
		return false;
	}

}
