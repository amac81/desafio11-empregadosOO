/**
* Este programa le os dados de um departamento, de endereço e dos seus empregados. 
* Gera um relatório de folha de pagamento com dia de pagamento e a soma dos salarios de todos os empregados
* 
* @author  Arnaldo Canelas
* @version 1.0
* @since   2023-12-06 
*/

package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;
import utils.Ui;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Objeto Scanner para entrada de dados, a partir de System.in 
		Scanner sc = new Scanner(System.in);

		//Variaveis
		int nEmployees = 0; 
		int reps = 0;
		int payDay = 0;
				
		//Pedir dados do departamento
		System.out.print("Nome do departamento: ");
		String departmentName = sc.nextLine();
		payDay = Ui.askAndValidateIntInput("Dia do pagamento: ", sc, 1, 31);

		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Phone: ");
		String phone = sc.nextLine();
		
		// Instanciacao de um Address		
		Address address = new Address(email, phone);
		
		// Instanciacao de um Department
		//Associacao entre Department e Address (composicao de objetos)
		Department department = new Department(departmentName, payDay, address);		
	
		nEmployees = Ui.askAndValidateIntInput("Quantos funcionários tem o departamento? ", sc, 0, 9999);
		System.out.println();
		
		do {
			System.out.println("Dados do funcionário " + (reps+1) + ": ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			double salary = Ui.askAndValidateDoubleInput("Salário: ", sc);
			
			System.out.println("Nome: " + name + ", salário: " + salary);
			
			reps ++;
		} while(reps < nEmployees);
		
		showReport(department);
		sc.close();
	}
	
	private static void showReport(Department department) {
		// MOSTRAR NA TELA OS DADOS DO RELATÓRIO
		System.out.println("\nFOLHA DE PAGAMENTO:\n");
		System.out.printf("Departamento %s = R$ %.2f\n", department.getName(), department.payroll());
		System.out.println("Pagamento realizado no dia " + department.getPayDay());
		System.out.println("Funcionários:");
		
		//Listagem dos funcionarios do department
		if(department.getEmployees() != null) 
		{
			for(Employee e: department.getEmployees()) {
				System.out.println(e.getName());
			}
		}
		else {
			System.out.println("Departamento sem funcionários");
		}
			
		System.out.println("\nPara dúvidas favor entrar em contato: vendas@lojatop.com");
	}
		
}
;