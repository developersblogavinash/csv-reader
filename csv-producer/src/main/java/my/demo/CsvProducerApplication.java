package my.demo;

import my.demo.producer.LineProducer;
import my.demo.reader.CsvReader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CsvProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvProducerApplication.class, args);
	}

	@Bean
	public CommandLineRunner sendFile(LineProducer lineProducer, CsvReader csvReader) {
		return args -> {
			csvReader.readAndCallback("classpath:test.csv", lineProducer::sendMessage);
		};
	}
}
