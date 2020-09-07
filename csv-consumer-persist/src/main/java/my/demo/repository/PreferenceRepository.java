package my.demo.repository;

import org.springframework.data.repository.CrudRepository;

import my.demo.domain.Preference;

import java.util.UUID;

public interface PreferenceRepository extends CrudRepository<Preference, UUID> {
}
