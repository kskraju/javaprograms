package com.gym.javap.Immutable;

/**
1) Don’t provide “setter” methods — methods that modify fields or objects referred to by fields.
This principle says that for all mutable properties in your class, do not provide setter methods. 
Setter methods are meant to change the state of object and this is what we want to prevent here.

2) Make all fields final and private
This is another way to increase immutability. Fields declared private will not be accessible outside 
the class and making them final will ensure the even accidentally you can not change them.

3) Don’t allow subclasses to override methods
The simplest way to do this is to declare the class as final. Final classes in java can not be overridden.

 */
public final class Immutable {

	private final String firstName;
	private final String lastName;
	private final int empId;
	
	private Immutable (String firstName, String lastName, int empId){
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}
	
	public static Immutable createInstance(String firstName, String lastName, int empId){
		return new Immutable(firstName, lastName, empId);
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getEmpId() {
		return empId;
	}
	
	public String toString(){
		return firstName +"    :  "+lastName + "    :    "+empId;
	}
}
