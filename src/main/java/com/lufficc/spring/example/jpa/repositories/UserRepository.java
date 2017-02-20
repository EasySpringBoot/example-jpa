package com.lufficc.spring.example.jpa.repositories;

import com.lufficc.spring.example.jpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lufficc
 * When 2017/2/20
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
