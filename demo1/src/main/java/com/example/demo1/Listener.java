package com.example.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.kafka.listener.config.ContainerProperties;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.logging.log4j.LogManager;

public class Listener {
	private static final Logger logger = LogManager.getLogger(Listener.class);

	/*@KafkaListener(id = "foo", topics = "myTopic")
	public void listen(String data) {
		System.out.println("data - " + data);
	}*/
	@Test
	public void testAutoCommit() throws Exception {
	
	    logger.info("Start auto");
	    ContainerProperties containerProps = new ContainerProperties("myTopic");
	    KafkaMessageListenerContainer<Integer, String> container = createContainer(containerProps);
	    final CountDownLatch latch = new CountDownLatch(4);
	    containerProps.setMessageListener(new MessageListener<Integer, String>() {

	        @Override
	        public void onMessage(ConsumerRecord<Integer, String> message) {
	            logger.info("received: " + message);
	            latch.countDown();
	        }

	    });
	    container.setBeanName("testAuto");
	    container.start();
	    /*Thread.sleep(1000); // wait a bit for the container to start
	    KafkaTemplate<Integer, String> template = createTemplate();
	    template.setDefaultTopic(topic1);
	    template.sendDefault(0, "foo");
	    template.sendDefault(2, "bar");
	    template.sendDefault(0, "baz");
	    template.sendDefault(2, "qux");
	    template.flush();
	    assertTrue(latch.await(60, TimeUnit.SECONDS));*/
	    container.stop();
	    logger.info("Stop auto");

	}

	private KafkaMessageListenerContainer<Integer, String> createContainer(ContainerProperties containerProps) {
		// TODO Auto-generated method stub
		return null;
	}

}
