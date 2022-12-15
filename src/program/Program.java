//package program;
//
//import entitys.Employee;
//import java.util.Scanner;
//
//public class Program {
//  
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    
//    Employee employee = new Employee();
//    
//    
//    
//    System.out.println("Insira o nome do funcionário: ");
//    employee.name = sc.nextLine();
//    System.out.println("Insira o salario bruto do funcionário: ");
//    employee.grossSalary = sc.nextDouble();
//    System.out.println("Insira a taxa: ");
//    employee.tax = sc.nextDouble();
//    
//    System.out.println("Funcionário: " + employee.name + ", $" + employee.netSalary());
//    
//    System.out.println("Qual é a porcentagem de incremento? ");
//    double percentage = sc.nextDouble();
//    
//    
//    
//    
//    
//    System.out.println("O salário fica: $" + employee.increaseSalary(percentage));
//    
//    sc.close();
//  }
//  
//}


package program;
import java.util.Locale;
import java.util.Scanner;
import entitys.Employee;
public class Program {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
Employee emp = new Employee();
System.out.print("Name: ");
emp.name = sc.nextLine();
System.out.print("Gross salary: ");
emp.grossSalary = sc.nextDouble();
System.out.print("Tax: ");
emp.tax = sc.nextDouble();
System.out.println();
System.out.println("Employee: " + emp);
System.out.println();
System.out.print("Which percentage to increase salary? ");
double percentage = sc.nextDouble();
emp.increaseSalary(percentage);
System.out.println();
System.out.println("Updated data: " + emp);
sc.close();
}
}