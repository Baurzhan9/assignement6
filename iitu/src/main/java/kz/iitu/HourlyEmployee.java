package kz.iitu;


public class HourlyEmployee{
	 private EmployeeDTO employee;
	 private double wage; 
	 private double hours;


	public HourlyEmployee(){
		setWage( employee.getHourRate() );
		setHours( employee.getHoursWorked()); 
	} 
	
	public void setWage( double hourlyWage ){
		wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
	} 
	
	public double getWage(){
		return wage;
	} 
	
	
	public void setHours( double hoursWorked ){
		hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ?
		hoursWorked : 0.0;
	} 
	
	public double getHours(){
		return hours;
	} 
	
	public double earnings(){
		if ( getHours() <= 40 ) 
			return getWage() * getHours();
		else
			return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
	} 
	
	
	public String toString(){
		return String.format( "%s: $%,.2f; %s: %,.2f",
	 "hourly wage", getWage(), "hours worked", getHours() );
	} 
} 
