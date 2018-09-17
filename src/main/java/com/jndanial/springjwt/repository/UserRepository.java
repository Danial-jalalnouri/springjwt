package com.jndanial.springjwt.repository;

import com.jndanial.springjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by jndanial.com (danial jalal nouri).
 * http://http://www.jndanial.com/54/
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);
}
