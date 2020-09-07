package my.demo.config;

import my.demo.repository.*;
import my.demo.service.LineService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public LineService lineService(UserRepository userRepository, GenderRepository genderRepository, CountryRepository countryRepository, ActivityRepository activityRepository, PreferenceRepository preferenceRepository, AccountRepository accountRepository) {
        return new LineService(userRepository, genderRepository, countryRepository, activityRepository, preferenceRepository, accountRepository);
    }

}
