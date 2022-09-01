package entities;

import java.util.Map;
import java.util.TreeMap;

public class Employee {
	
	
	private static Map <Integer, Employee> employeeMap = new TreeMap<Integer, Employee>();
	
	public static Map<Integer, Employee> getEmployeeMap() {
		return employeeMap;
	}

	private String name;
	private Position position;
	private double salary;
	private static int ID = 1;
	
	public static String getID() {
		return String.valueOf(ID);
	}

	public static void setID(int id) {
		ID = id;
	}

	public Employee(String name, Position position, double salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	
	
	public String getName() {
		return name;
	}


	public Position getPosition() {
		return position;
	}


	public double getSalary() {
		return salary;
	}


	public static  Employee getEmployee (int key) {
		return employeeMap.get(key);
	}
	

	public boolean putMap (Employee employee) {
		employeeMap.put(this.ID, employee);
		ID++;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
	
	

}
