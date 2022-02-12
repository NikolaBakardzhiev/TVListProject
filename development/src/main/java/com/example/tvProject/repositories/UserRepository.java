package com.example.tvProject.repositories;


import com.example.tvProject.models.entities.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
    Optional <UserModel>findByNameAndRadioOrTv (String name, String radioOrTv);
}
