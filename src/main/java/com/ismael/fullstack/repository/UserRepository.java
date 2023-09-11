package com.ismael.fullstack.repository;

import com.ismael.fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
