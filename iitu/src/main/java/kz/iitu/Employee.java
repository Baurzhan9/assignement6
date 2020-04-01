package kz.iitu;

import javax.persistence.*;
import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table(name="employee1")
public class Employee extends AbstractPersistable<Long>{

	private String firstName;
	
	private String lastName;
	
	private double fixedSalary;
	
	private double hourRate;
	
	private int hoursWorked;
	
	private float commRate;
		
	 public Employee(){
	 }
	 public Employee( String first, String last,
			 		double fixSalary, double hourR,
			 		int hoursWork, float commR){
		 firstName = first;
		 lastName = last;
		 fixedSalary = fixSalary;
		 hourRate = hourR;
		 hoursWorked = hoursWork;
		 commRate = commR;
	 }
	 
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
		return "Employee{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", fixedSalary=" + fixedSalary +
				", hourRate=" + hourRate +
				", hoursWorked=" + hoursWorked +
				", commRate=" + commRate +
				'}' + "\n";
	}
}
