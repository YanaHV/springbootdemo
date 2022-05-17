package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringbootdemoApplication extends BigBike{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
	@EventListener(ContextRefreshedEvent.class)
	public void bigBikeMethod() {
		BigBike bigBike = new BigBike();
		bigBike.allDependents();
	}
}
