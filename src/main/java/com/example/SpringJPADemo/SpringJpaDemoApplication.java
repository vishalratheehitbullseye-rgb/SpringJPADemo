package com.example.SpringJPADemo;

import com.example.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJpaDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.
						run(SpringJpaDemoApplication.class, args);

		StudentController controller =
				context.getBean(StudentController.class);


	}

}
