package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Person;
//import com.example.demo.entities.Theme;

@Service 
public class PersonServices {
	private List<Person> persons = new ArrayList<Person>();
	
	public boolean addPerson(Person aPerson) {
		if (!persons.contains(aPerson)) {
			persons.add(aPerson);
			return true;
		}else {
			return false;
		}
		
	}

	public List<Person> removePerson(Integer id) {
		persons.removeIf(person -> person.getId() == id);
		return persons;
	}

	public List<Person> updatePerson(int id, String newFirstName, String newLastName) {
		for (Person person : persons) {
			if (person.getId() == id) {
				if (newFirstName != null)
					person.setLastName(newFirstName);
				if (newLastName != null)
					person.setLastName(newLastName);
			}
		}
		return persons;
	}
}
