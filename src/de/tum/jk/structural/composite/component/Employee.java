package de.tum.jk.structural.composite.component;

public abstract class Employee {

	private String name;

	

	public Employee(String name) {
		super();
		this.name = name;
	}


	public abstract int calculateSalary();


}
