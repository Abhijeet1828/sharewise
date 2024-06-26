package com.custom.sharewise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This application is used for sharing expenses in a group.
 * 
 * @author Abhijeet
 *
 */
@ComponentScan(basePackages = { "com.custom.common.utilities", "com.custom.sharewise" })
@SpringBootApplication
public class SharewiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharewiseApplication.class, args);
	}

}
