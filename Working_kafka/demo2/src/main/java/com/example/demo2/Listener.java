package com.example.demo2;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;


@RunWith(SpringRunner.class)
public class Listener {
	//private static final Logger logger = LogManager.getLogger(Listener.class);

	@KafkaListener(id = "foo", topics = "myTopic")
	public void listen(String data) {
		System.out.println("data - " + data);
	}

}
