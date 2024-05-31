package com.ApiRests2.backend2.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.ApiRests2.backend2.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
