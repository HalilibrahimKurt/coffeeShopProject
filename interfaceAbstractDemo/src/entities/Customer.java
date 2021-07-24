package entities;

import abstracts.IEntity;

public class Customer implements IEntity {
	public int id;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public long nationalityId;

	public Customer(int id, String firstName, String lastName, int dateOfBirth, long nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	

	
}
