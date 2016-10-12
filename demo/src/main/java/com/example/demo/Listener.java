package com.example.demo;
import org.springframework.kafka.annotation.KafkaListener;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Listener {
	private static final Logger logger = LogManager.getLogger(Listener.class);
	@KafkaListener(id = "foo", topics = "myTopic")
	public void listen(String data) {
        
    }

}
