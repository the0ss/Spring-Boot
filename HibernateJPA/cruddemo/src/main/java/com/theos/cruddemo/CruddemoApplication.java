package com.theos.cruddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.theos.cruddemo.dao.StudentDAO;
import com.theos.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
		//	createStudent(studentDAO);
		//	readStudent(studentDAO);
		queryForStudents(studentDAO);
		};
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents=studentDAO.findAll();
		for(Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
		
	}
	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating object...");
		Student newsStudent= new Student("swarn", "lata", "swarn@gmail.com");

		System.out.println("Saving the object...");
		studentDAO.save(newsStudent);

		int tid=newsStudent.getId();
		System.out.println("Student saved. Generated Id: "+ tid);

		System.out.println("Retriving Student with id: "+ tid);
		Student myStudent=studentDAO.findByid(tid);

		System.out.println("Found the student: "+ myStudent);


	}
	// private void createStudent(StudentDAO studentDAO) {

	// 	System.out.println("Creating Student Ojject...");
	// 	Student student=new Student("shivam", "singh", "@gmail.com");

	// 	System.out.println("Saving the object...");
	// 	studentDAO.save(student);

	// 	System.out.println("Saved "+ student.getId());

	// }

}
