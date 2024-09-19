package com.ex.proto;

import org.apache.catalina.webresources.FileResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;

@SpringBootApplication
public class ProtoApplication {

	public ProtoApplication() throws FileNotFoundException {
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ProtoApplication.class, args);
		File file
				= new File("xx.txt") ;



		FileSystemResource x

				= new FileSystemResource(file) ;
		PrintWriter asd



				= new PrintWriter(x.getOutputStream(),true) ;

	}
}