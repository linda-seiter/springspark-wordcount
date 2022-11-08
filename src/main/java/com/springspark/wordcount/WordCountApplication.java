package com.springspark.wordcount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Tutorial : http://www.technocratsid.com/spring-boot-apache-spark/
// Error: controller request method should be get not post
// Error: escaping | not working for split, use comma instead
// Test with: http://localhost:8080/wordcount?words=hi,hello,hi
@SpringBootApplication
public class WordCountApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordCountApplication.class, args);
	}

}
