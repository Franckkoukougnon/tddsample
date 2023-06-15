package com.tddsample.tddsample.service;

import com.tddsample.tddsample.models.UsersEntity;

import java.util.Optional;
import java.util.Set;

public interface UserService {

    Set<UsersEntity> findUser(Long idSexe);

    Optional<UsersEntity> findUserById(int id);

    void addUser(UsersEntity usersEntity);

    Long createUser(UsersEntity usersEntity, Long idSex);
}
