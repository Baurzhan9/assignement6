package kz.iitu;

public class SalariedEmployee{
	private EmployeeDTO employee;
	private double weeklySalary;
 
	public SalariedEmployee( ){
		setWeeklySalary( employee.getFixSalary() ); 
	 }
	
	
	 public void setWeeklySalary( double salary ){
		 weeklySalary = salary < 0.0 ? 0.0 : salary;
	 } 
	
	
	 public double getWeeklySalary(){
		 return weeklySalary;
	 } 
	
	 public double earnings(){
		 return getWeeklySalary();
	 } 
	
	
	 public String toString(){
		 return String.format( "%s: $%,.2f", "weekly salary", getWeeklySalary() );
	 } 
}
 