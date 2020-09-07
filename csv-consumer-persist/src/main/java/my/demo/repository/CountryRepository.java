package my.demo.repository;

import org.springframework.data.repository.CrudRepository;

import my.demo.domain.Country;

import java.util.UUID;

public interface CountryRepository extends CrudRepository<Country, UUID> {

    boolean existsByCode(String code);
    Country findByCode(String code);
}
