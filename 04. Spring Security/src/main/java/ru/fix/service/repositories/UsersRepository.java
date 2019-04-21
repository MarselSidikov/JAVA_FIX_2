package ru.fix.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.fix.service.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String email);
}
