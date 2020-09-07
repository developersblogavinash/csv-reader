package my.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import my.demo.config.KafkaConsumerConfig;

@SpringBootApplication
@Import(KafkaConsumerConfig.class)
public class CsvConsumerPersistApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvConsumerPersistApplication.class, args);
	}

}
