package com.example.demo2;


import java.net.MalformedURLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class App {

	public static void main(String args[]) throws MalformedURLException {

		SpringApplication.run(App.class, args);
	}
}