package my.demo.repository;

import org.springframework.data.repository.CrudRepository;

import my.demo.domain.Activity;
import my.demo.domain.User;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

public interface ActivityRepository extends CrudRepository<Activity, UUID> {
    Optional<Activity> findByLastLoginAndUser(ZonedDateTime zonedDateTime, User user);
}
