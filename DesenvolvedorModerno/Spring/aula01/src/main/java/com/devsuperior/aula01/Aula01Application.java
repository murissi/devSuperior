package com.devsuperior.aula01;

import com.devsuperior.entities.Employee;
import com.devsuperior.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devesuperior"})
public class Aula01Application implements CommandLineRunner {

	private SalaryService salaryService;

	public Aula01Application(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Aula01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria",4000.0);
		System.out.println(salaryService.netSalary(employee));
	}
}
