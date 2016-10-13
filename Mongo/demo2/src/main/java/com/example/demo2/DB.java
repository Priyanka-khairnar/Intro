package com.example.demo2;

import java.net.UnknownHostException;
import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;


import com.mongodb.MongoClient;

public class DB {
	static String DATA;
	public static final String DB_NAME = "pcx";
	public static final String COLLECTION = "mycoll";
	public static final String MONGO_HOST = "localhost";
	public static final int MONGO_PORT = 27017;

	public DB(String DATA) {
		this.DATA = DATA;
	}

	public void inserting() {
		try {
			
			MongoClient mongo = new MongoClient(MONGO_HOST, MONGO_PORT);
			MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
			Coll c = new Coll(DATA);;
			mongoOps.save(c);
			List<Coll> people=mongoOps.findAll(Coll.class);
			System.out.println(people);
			mongo.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
