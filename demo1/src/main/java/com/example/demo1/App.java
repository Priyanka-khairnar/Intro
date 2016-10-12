package com.example.demo1;

import java.util.Arrays;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.logging.log4j.status.StatusLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.glass.ui.Window.Level;

//import kafka.consumer.KafkaStream;
@SpringBootApplication
public class App {
	public App(){};
	 
	//static Config con=new Config();
	public static void main(String args[]) {
	
		/*KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(con.consumerConfigs());
		consumer.subscribe(Arrays.asList("myTopic"));
		while (true) {
	        // Poll for ConsumerRecords for a certain amount of time
	        ConsumerRecords<String, String> records = consumer.poll(1000);

	        // Process the ConsumerRecords, if any, that came back
	        for (ConsumerRecord<String, String> record : records) {
	                String key = record.key();
	                String value = record.value();
	                System.out.println(key+":"+value);
	                // Do something with message
	        }
	      }

	    }*/
		SpringApplication.run(Config.class, args);
		/*ApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Config.class);

				Config con = ctx.getBean(Config.class);
				
				con.listener();
				Listener obj=new Listener();
				//obj.listen(data);
	*/
	}
}