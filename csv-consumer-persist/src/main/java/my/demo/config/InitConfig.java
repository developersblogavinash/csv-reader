package my.demo.config;

import my.demo.init.CountryInit;
import my.demo.init.GenderInit;
import my.demo.repository.CountryRepository;
import my.demo.repository.GenderRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitConfig {

    @Bean
    public GenderInit genderInit(GenderRepository genderRepository) {
        return new GenderInit(genderRepository);
    }

    @Bean
    public CountryInit countryInit(CountryRepository countryRepository) {
        return new CountryInit(countryRepository);
    }

    @Bean
    public CommandLineRunner initDb(GenderInit genderInit, CountryInit countryInit) {
        return arg -> {

            genderInit.init();
            countryInit.init();

        };
    }}
