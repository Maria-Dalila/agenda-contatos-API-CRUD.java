package com.dalila.agendacontatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.dalila.agendacontatos.domain")
@SpringBootApplication
public class AgendacontatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendacontatosApplication.class, args);

	}

}
