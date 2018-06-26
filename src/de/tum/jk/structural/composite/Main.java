package de.tum.jk.structural.composite;

import de.tum.jk.structural.composite.composite.Manager;
import de.tum.jk.structural.composite.leaf.Developer;

public class Main {

	public static void main(String[] args) {

		Manager m = new Manager("The Boss");
		Developer d1 = new Developer("Dev #1");
		Developer d2 = new Developer("Dev #2");
		m.addEmployee(d1);
		m.addEmployee(d2);
		System.out.println("Overall sum: "+m.calculateSalary());
	}
}
