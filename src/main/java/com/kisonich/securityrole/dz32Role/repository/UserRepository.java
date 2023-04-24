package com.kisonich.securityrole.dz32Role.repository;

import com.kisonich.securityrole.dz32Role.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String username);

    User findByLogin(String login);

}