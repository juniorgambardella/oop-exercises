package program;

import entitys.Employee;
import java.util.Scanner;

public class Program {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Employee employee = new Employee();
    
    System.out.println("Insira o nome do funcionário: ");
    employee.name = sc.nextLine();
    System.out.println("Insira o salario bruto do funcionário: ");
    employee.grossSalary = sc.nextDouble();
    System.out.println("Insira a taxa: ");
    employee.tax = sc.nextDouble();
    
    System.out.println("Funcionário: " + employee.name + ", $" + employee.netSalary());
    
    System.out.println("Qual é a porcentagem de incremento? ");
    double percentage = sc.nextDouble();
   
    System.out.println("O salário fica: $" + employee.increaseSalary(percentage));
    
    sc.close();
  }
  
}
