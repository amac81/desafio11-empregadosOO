package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private int payDay;
	private Address address;
	//instanciacao da lista de employees
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Department() {}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
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
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}

	// soma dos salarios de todos os trabalhadores do departamento
	public double payroll() {
		double salarySum = 0.0;
		
		for(Employee e: employees) {
			salarySum += e.getSalary();
		}
		
		return salarySum;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", payDay=" + payDay + ", address=" + address + ", employees=" + employees
				+ "]";
	}
	
}
