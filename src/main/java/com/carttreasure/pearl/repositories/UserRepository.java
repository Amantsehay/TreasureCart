package com.carttreasure.pearl.repositories;

import com.carttreasure.pearl.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{


    User findByUsername (String username);
}
