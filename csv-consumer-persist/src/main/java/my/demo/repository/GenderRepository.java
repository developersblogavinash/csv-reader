package my.demo.repository;

import org.springframework.data.repository.CrudRepository;

import my.demo.domain.Gender;

import java.util.UUID;

public interface GenderRepository extends CrudRepository<Gender, UUID> {

    boolean existsByLabel(String label);
    Gender findByLabel(String label);

}
