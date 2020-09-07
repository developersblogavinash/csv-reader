package my.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import my.demo.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
