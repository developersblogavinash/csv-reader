package my.demo.repository;

import org.springframework.data.repository.CrudRepository;

import my.demo.domain.Account;

import java.util.UUID;

public interface AccountRepository extends CrudRepository<Account, UUID> {
}
