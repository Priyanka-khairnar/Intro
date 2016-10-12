package com.example.demo2;

import java.util.Arrays;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//import kafka.consumer.KafkaStream;
@SpringBootApplication
@ComponentScan
public class App {
	public App() {
	};

	//static Logger log = Logger.getLogger(App.class);

	public static void main(String args[]) {
		//BasicConfigurator.configure();
		//log.info("This is Logger Info");
		
		ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Config.class);
				Config con = ctx.getBean(Config.class);
		SpringApplication.run(App.class, args);
	}
}