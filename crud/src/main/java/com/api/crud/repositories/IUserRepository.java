package com.api.crud.repositories;

import com.api.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository       //Repository extendiendo de JPA permite hacer consultas a DB
public interface IUserRepository extends JpaRepository<UserModel, Long> {



}
