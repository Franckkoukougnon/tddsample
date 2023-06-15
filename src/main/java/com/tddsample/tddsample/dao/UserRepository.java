package com.tddsample.tddsample.dao;

import com.tddsample.tddsample.models.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UsersEntity, Long> {
}
