package kz.iitu;


public class CommissionEmployee{
	private EmployeeDTO employee;
	private double grossSales;
	private double commissionRate; 
	
	
	public CommissionEmployee(){
		setGrossSales( employee.getFixSalary() );
		setCommissionRate( employee.getCommRate() );
	}
	
	public void setCommissionRate( double rate ){
		commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
	}
	
	public double getCommissionRate(){
		return commissionRate;
	} 
	public void setGrossSales( double sales ){
		grossSales = ( sales < 0.0 ) ? 0.0 : sales;
	} 
	
	public double getGrossSales(){
		return grossSales;
	}
	public double earnings(){
		return getCommissionRate() * getGrossSales();
	}
	
	
	public String toString(){
		return String.format( "%s: $%,.2f; %s: %.2f",
			"gross sales", getGrossSales(),
			"commission rate", getCommissionRate() );
	}
}
