package de.tum.jk.structural.composite.composite;

import java.util.LinkedList;

import de.tum.jk.structural.composite.component.Employee;

public class Manager extends Employee {

	private int baseSalary = 2000;
	private LinkedList<Employee> employees;

	public Manager(String name) {
		super(name);
		employees = new LinkedList<Employee>();

	}

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public void removeEmployee(Employee e) {
		employees.remove(e);
	}

	@Override
	public int calculateSalary() {
		int salary = baseSalary;
		System.out.println("Sum added as a base salary: " + baseSalary);
		for (Employee e : employees) {
			// do calc by accessing employees
			System.out.println("Sum added for employee below: " + e.calculateSalary() * 0.3);
			salary = (int) (salary + e.calculateSalary() * 0.3);// for each E in the list
		}
		return salary;
	}

}
