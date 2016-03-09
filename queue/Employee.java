package com.gym.javap.queue;

class Employee {
   public String lastName;
   public String firstName;
   public Employee() {
   }
   public Employee(String last, String first) {
      this.lastName = last;
      this.firstName = first;
   }
   public String toString() {
      return firstName + " " + lastName;
   }
}

