package com.epam.edai.run8.team18.repository;

import com.epam.edai.run8.team18.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}