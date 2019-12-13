package com.capgemini.contactapp.dao;

import java.util.List;

import com.capgemini.contactapp.bean.ContactBean;

public interface ContactDAO {
	List<ContactBean> getAllContact();
	public boolean search(String name);
	public boolean updateContact(ContactBean contact);
	public boolean addContact(ContactBean contact);
	public boolean deleteContact(String name);
}
