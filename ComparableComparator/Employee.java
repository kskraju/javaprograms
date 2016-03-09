package com.gym.javap.ComparableComparator;

/***
 * Comparable interface provides one method compareTo(T o) to implement in any class so that two instances of that class can be compared. 
   Signature of method is:
   public int compareTo(T o);
   Here, out of two instances to compare, one is instance itself on which method will be invoked, and other is passed as parameter o.
 * 
 * */

public class Employee implements Comparable<Employee> {
    private int id = -1;
   

	private String firstName = null;
    private String lastName = null;
    private int age = -1;
 
    public Employee(int id, String fName, String lName, int age) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
 
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
    
    @Override
    public String toString() {
        return "Employee : " + id + " - " + firstName + " - " + lastName
        + " - " + age + "n";
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    // Other accessor methods here
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
