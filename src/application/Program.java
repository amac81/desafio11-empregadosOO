/**
* Este programa le os dados de um departamento, de endereço e dos seus empregados. 
* Gera um relatório de folha de pagamento
* 
* @author  Arnaldo Canelas
* @version 1.0
* @since   2023-12-06 
*/

package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import utils.Ui;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Objeto Scanner para entrada de dados, a partir de System.in 
		Scanner sc = new Scanner(System.in);

		//Variaveis
		String nomeDepartment = "";
		int payDay = 0;
		
		//Pedir dados do departamento
		System.out.print("Nome do departamento: ");
		nomeDepartment = sc.nextLine();
		payDay = Ui.askAndValidateIntInput("Dia do pagamento: ", sc, 1, 31);
		
		
		
		Department department = new Department();		
		showReport(department);
		sc.close();
	}
	
	private static void showReport(Department department) {
		// MOSTRAR NA TELA OS DADOS DO RELATÓRIO
		System.out.println("FOLHA DE PAGAMENTO:");
	}
		
}
;