package kz.iitu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IocApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(IocApplication.class, args);

	}


//@Bean
//public CommandLineRunner bootstrap(employeeRepository employeeRepository) {
//		return(args)->{
//			employeeRepository.save(new Employee("Arman", "Maksatovich", 0, 10.0, 41, 20, HourlyEmployee, SalariedEmployee, CommissionEmployee));
//			employeeRepository.save(new Employee("Harry", "Potter", 20000.00, 0.0, 30, 20, HourlyEmployee, SalariedEmployee, CommissionEmployee));
//			employeeRepository.save(new Employee("Ivan", "Popovich", 15000.00, 0.0, 25, 15, HourlyEmployee, SalariedEmployee, CommissionEmployee));
//			
//			for(Employee employee: employeeRepository.findAll()) {
//				System.out.println(employee.toString());
//			}
//		};
//	}
	
}