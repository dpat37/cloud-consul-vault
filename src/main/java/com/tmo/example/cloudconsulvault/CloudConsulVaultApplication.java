package com.tmo.example.cloudconsulvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsulVaultApplication {

	public static void main(String[] args) {SpringApplication.run(CloudConsulVaultApplication.class, args);}

}
