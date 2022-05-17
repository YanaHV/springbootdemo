package com.example.springbootdemo;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
@AllArgsConstructor
@SpringBootApplication
public class SpringbootdemoApplication{
 private final BigBike bigBike;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
	@EventListener(ContextRefreshedEvent.class)
	public void bigBikeMethod() {
		bigBike.allDependents();
	}
}
