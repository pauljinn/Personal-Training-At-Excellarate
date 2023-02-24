package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact> list = List.of(new Contact(10L, "so@gmail.com","testcontact", 1L),
			new Contact(11L, "son@gmail.com","testcontact1", 1L),
			new Contact(12L, "soni@gmail.com","testcontact2", 3L));
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter((contact)->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
