package com.abc.spring.kafka.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaPublisherApplication {

	@Autowired
	private KafkaTemplate<String, Object> template;

	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name){
		template.send("javatopic","Hi "+ name+ "welcome!!!");
		return "Data Published";
	}

	@GetMapping("/publishJson")
	public String publishMessage(){
		User user = new User(1234,"Tester",new String[] {"wyckoff road","wyckoff","NJ"});
		template.send("javatopic",user);
		return "Json Data Published";
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaPublisherApplication.class, args);
	}

}
