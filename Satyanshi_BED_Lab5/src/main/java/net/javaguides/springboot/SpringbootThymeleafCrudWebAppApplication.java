package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootThymeleafCrudWebAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafCrudWebAppApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Inserted sample records Employee emp = new Employee("Saty", "g",
		 * "Satyg@gmail.com"); employeeRepository.save(emp); Employee emp1 = new
		 * Employee("st", "g", "stg@gmail.com");
		 * 
		 * employeeRepository.save(emp1); Employee emp2 = new Employee("Surendra", "G",
		 * "surenG@gmail.com");
		 * 
		 * employeeRepository.save(emp2);
		 * 
		 * }
		 */
	}
}
