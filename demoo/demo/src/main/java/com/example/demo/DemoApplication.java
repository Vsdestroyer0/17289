package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hola web");
		
	}

	@RequestMapping("/")
	public String home(){
		System.out.println("Bienvenido");
		return "Bienvenido";
	}

	@RequestMapping("/adios")
	public String Adios(){
		System.out.println("Adios");
		return "Adios";
	}

	@RequestMapping("/hola")
	public String hola(){
		System.out.println("Hola");
		return "Hola";
	}

	@RequestMapping("/html")
	public String html(){
		String html = "<html>\n" +
				"<head><title>Sample HTML</title></head>\n" +
				"<body>\n" +
				"<h1>Welcome</h1>\n" +
				"<p>This is a simple HTML page served by Spring Boot.</p>\n" +
				"</body>\n" +
				"</html>";
		return html;
	}

}



