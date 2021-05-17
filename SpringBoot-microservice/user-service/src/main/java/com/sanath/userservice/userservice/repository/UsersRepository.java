package com.sanath.userservice.userservice.repository;

import com.sanath.userservice.userservice.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByUserId(Long userId);
}
