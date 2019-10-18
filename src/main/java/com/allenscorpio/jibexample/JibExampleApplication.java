package com.allenscorpio.jibexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class JibExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JibExampleApplication.class, args);
	}

	@GetMapping("/server-time")
	public ResponseEntity getServerTime() {
		return ResponseEntity.ok(String.format("Server time: %s ", new Date()));
	}
}
