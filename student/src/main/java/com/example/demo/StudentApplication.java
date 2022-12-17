package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student stu1=new Student("Luon", "Verak", "luonverak@gmail.com");
//		studentRepository.save(stu1);
//		
//		Student stu2=new Student("Sok", "Cheata", "sokcheata@gmail.com");
//		studentRepository.save(stu2);
//		
//		Student stu3=new Student("Seng", "Lyna", "senglyna@gmail.com");
//		studentRepository.save(stu3);
//		
	}

}
