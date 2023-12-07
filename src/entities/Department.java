package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int payDay;
	private List<Employee> employees;
	
	public Department() {
		employees = new ArrayList<Employee>();
	}

	public Department(String name, int payDay) {
		this.name = name;
		this.payDay = payDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public double payroll() {
		return 0.0;
	}
	
}
