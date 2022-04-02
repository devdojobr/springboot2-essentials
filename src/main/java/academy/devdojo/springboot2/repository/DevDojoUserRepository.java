package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.DevDojoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevDojoUserRepository extends JpaRepository<DevDojoUser, Long> {

    DevDojoUser findByUsername(String username);
}