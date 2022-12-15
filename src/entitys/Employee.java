//package entitys;
//
//public class Employee {
//  
//  public String name;
//  public double grossSalary;
//  public double tax;
//  //private double salary = grossSalary;
//  
//  public double netSalary() {
//    //salary = grossSalary;
//    return grossSalary - tax;
//  }
//  
//  public double increaseSalary(double percentage) {
//    System.out.println(grossSalary);
//    return grossSalary += grossSalary * percentage / 100;
//  }
//  
//}


package entitys;
public class Employee {
public String name;
public double grossSalary;
public double tax;
public double netSalary() {
return grossSalary - tax;
}
public double increaseSalary(double percentage) {
return grossSalary += grossSalary * percentage / 100.0;
}
public String toString() {
return name + ", $ " + netSalary();
}}