package com.project.ClientManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.ClientManagement.dao.daointerface;
import com.project.ClientManagement.entity.Client;

@SpringBootApplication
public class ClientManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ClientManagementApplication.class, args);
	}

	
	@Autowired
	private daointerface dao;
	@Override
	public void run(String... args) throws Exception {
		Client client1=new Client("Somya","Jain","somya@gmail.com");
		dao.save(client1);
	}

}
