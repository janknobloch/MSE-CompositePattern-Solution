package de.tum.jk.structural.composite.leaf;

import de.tum.jk.structural.composite.component.Employee;

public class Developer extends Employee {

	int baseSalary = 2000;

	public Developer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return baseSalary;
	}

}
