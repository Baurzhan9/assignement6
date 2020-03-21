package kz.iitu;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDTO implements Serializable{
	@Autowired
    private employeeRepository emplRepo;
	private HourlyEmployee HourlyEmployee;
	private SalariedEmployee SalariedEmployee;
	private CommissionEmployee CommissionEmployee;
	private Long id;
	private String firstName;
	private String lastName;
	private double fixedSalary;
	private double hourRate;
	private int hoursWorked;
	private float commRate;
	
	public EmployeeDTO(){}
	
	public EmployeeDTO(Employee employee) {
		this(employee.getFirstName(),
		 employee.getLastName(),
		 employee.getFixSalary(),
		 employee.getHourRate(),
		 employee.getHoursWorked(),
		 employee.getCommRate());
	}
	
//	 public EmployeeDTO(  
//			 		HourlyEmployee HourlyEmployee,
//			 		SalariedEmployee SalariedEmployee,
//			 		CommissionEmployee CommissionEmployee){
//		 this.CommissionEmployee = CommissionEmployee;
//		 this.SalariedEmployee = SalariedEmployee;
//		 this.HourlyEmployee = HourlyEmployee; }
		 
		 public EmployeeDTO(String firstName, String lastName, 
				 			double fixSalary, double hourRate, 
				 			int hoursWorked,  float commRate) {
			 this.firstName = firstName;
			 this.lastName = lastName;
			 this.fixedSalary = fixSalary;
			 this.hourRate = hourRate;
			 this.hoursWorked = hoursWorked;
			 this.commRate = commRate;
	}
		 
//		public void setHourlyEmployee(HourlyEmployee HourlyEmployee) 
//		 { this.HourlyEmployee = HourlyEmployee; }
//		 public void setCommissionEmployee(CommissionEmployee CommissionEmployee) 
//		 { this.CommissionEmployee = CommissionEmployee; }
//		 public void setSalariedEmployee(SalariedEmployee SalariedEmployee) 
//		 { this.SalariedEmployee = SalariedEmployee; }
		 
		 public void setId(Long id) { this.id = id; }
		 public Long getId() { return id; }
		 
		 public void setFirstName( String first ){ firstName = first; }
		 public String getFirstName(){ return firstName; } 
		 
		 public void setLastName( String last ){ lastName = last; } 	
		 public String getLastName(){ return lastName; } 
		 
		 public void setFixSalary(double fixSalary) { fixedSalary = fixSalary; }
		 public double getFixSalary() { return fixedSalary; }
		 
		 public void setHourRate(double hourR) { hourRate = hourR; }
		 public double getHourRate() { return hourRate; }
		 
		 public void setHoursWorked(int hoursWork) { hoursWorked = hoursWork; }
		 public int getHoursWorked() { return hoursWorked; }
		 
		 public void setCommRate(float commR) { commRate = commR; }
		 public float getCommRate() { return commRate; }
		 
		 
		 @Override
		    public String toString() {
		        return "User{" +
		                "id=" + id +
		                ", name='" + firstName + '\'' +
		                ", surname=" + lastName + 
		                '}' + 
		                "Salary{"  + HourlyEmployee.toString() +
		                			CommissionEmployee.toString() +
		                			SalariedEmployee.toString() +
		                			  "}" ;
		    }
	
}
