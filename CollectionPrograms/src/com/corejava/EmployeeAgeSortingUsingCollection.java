package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeAgeSortingUsingCollection {
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<>();
		
		emp.add(new Employee(12, "Ram", 23));
		emp.add(new Employee(123, "Sam", 3));
		emp.add(new Employee(2, "Tam", 39));
		Collections.sort(emp);
		for (Employee employee : emp) {
			System.out.println(employee);
			
		}
	}

}
class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.age-o.getAge();
	}
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}