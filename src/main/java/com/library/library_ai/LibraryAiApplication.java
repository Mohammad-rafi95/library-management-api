package com.library.library_ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.library.library_ai")
public class LibraryAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryAiApplication.class, args);
	}

}