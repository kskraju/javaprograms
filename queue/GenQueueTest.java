package com.gym.javap.queue;
public class GenQueueTest {
   public static void main(String[] args) {
      GenQueue<Employee> empList;
      empList = new GenQueue<Employee>();
      GenQueue<HourlyEmployee> hList;
      hList = new GenQueue<HourlyEmployee>();
      hList.enqueue(new HourlyEmployee("T", "D"));
      hList.enqueue(new HourlyEmployee("G", "B"));
      hList.enqueue(new HourlyEmployee("F", "S"));
      empList.addItems(hList);
      System.out.println("The employees' names are:");
      while (empList.hasItems()) {
         Employee emp = empList.dequeue();
         System.out.println(emp.firstName + " " 
         + emp.lastName);
      }
   }
}
