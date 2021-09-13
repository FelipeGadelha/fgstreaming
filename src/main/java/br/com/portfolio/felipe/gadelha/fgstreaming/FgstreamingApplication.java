package br.com.portfolio.felipe.gadelha.fgstreaming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
public class FgstreamingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FgstreamingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DefaultDataBufferFactory sharedInstance = DefaultDataBufferFactory.sharedInstance;
	}
}
