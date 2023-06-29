package com.javacrud.userdept.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javacrud.userdept.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
