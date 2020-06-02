package com.kimi.tmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kimi")
public class SpringTemplateApplication {
	
	/*
	* @wi drivepilot/DP-529 bonobo git TESTDD
	* http://localhost/polarion/#/project/drivepilot/workitem?id=DP-529
	*/
public String getAuthor() {
return this.author;
} 


	public static void main(String[] args) {
		//hello
		SpringApplication.run(SpringTemplateApplication.class, args);
		
	}

}
