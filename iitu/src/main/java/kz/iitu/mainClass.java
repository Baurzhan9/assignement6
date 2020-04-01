package kz.iitu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class mainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        employeeRepository employeeRepo = context.getBean("employeeRepository", employeeRepository.class);
        System.out.println(employeeRepo.findAll());

    }

}
