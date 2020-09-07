package my.demo.consumerlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import my.demo.consumerlog.config.KafkaConsumerConfig;

@SpringBootApplication
@Import(KafkaConsumerConfig.class)
public class CsvConsumerLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvConsumerLogApplication.class, args);
	}

}
