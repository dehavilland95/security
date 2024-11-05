package secutiry313.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import secutiry313.demo.models.User;

@Repository
@Component
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}