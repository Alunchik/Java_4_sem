package com.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {
	static FileWriter writer;
	static FileReader reader;

	static Scanner sc;
	@PostConstruct
	public void init() throws IOException {
		try {
			reader = new FileReader("src/main/resources/data");
			sc = new Scanner(reader);
			while (sc.hasNext()) {
				writer.write(sc.next().hashCode());
			}
			reader.close();
			writer.close();
			sc.close();
		} catch (Exception e) {
			writer.write("null");
			writer.close();
		}
	}

	@PreDestroy
	public void destroy() throws IOException {
		new File("src/main/resources/data").delete();
	}

	public static void main(String[] args) throws IOException {
		writer = new FileWriter("src/main/resources/buffered_data");
		SpringApplication.run(DemoApplication.class, args);
	}

}
