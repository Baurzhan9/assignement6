package kz.iitu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findAll();
}
