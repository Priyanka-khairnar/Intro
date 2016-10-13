package com.example.demo2;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
public class Listener {
	static String data;

	@KafkaListener(id = "foo", topics = "myTopic")
	public void listen(String data) {
		System.out.println("data - " + data);
		Coll c = new Coll(data);		
		DB db=new DB(data);
		db.inserting();
	

	}

}
