package com.likelion.test.Repository;

import com.likelion.test.Domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
