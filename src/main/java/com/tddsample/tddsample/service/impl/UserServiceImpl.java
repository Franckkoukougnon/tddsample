package com.tddsample.tddsample.service.impl;

import com.tddsample.tddsample.dao.SexeRepository;
import com.tddsample.tddsample.dao.UserRepository;
import com.tddsample.tddsample.models.SexeEntity;
import com.tddsample.tddsample.models.UsersEntity;
import com.tddsample.tddsample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SexeRepository sexeRepository;

    @Override
    public Set<UsersEntity> findUser(Long idSexe) {

        return sexeRepository.findById(Math.toIntExact(idSexe)).get().getUsersEntities();
    }

    @Override
    public Optional<UsersEntity> findUserById(int id) {
        return userRepository.findById(Long.valueOf(id));
    }

    @Override
    public void addUser(UsersEntity usersEntity) {
        userRepository.save(usersEntity);
    }

    @Override
    public Long createUser(UsersEntity usersEntity, Long idSex) {
        SexeEntity sexeDao = sexeRepository.findById(Math.toIntExact(idSex)).get();
        sexeDao.getUsersEntities().add(usersEntity);
        UsersEntity userDao = sexeDao.getUsersEntities().stream().filter(l -> l.equals(usersEntity)).findFirst().get();
        return (long) userDao.getIdusers();
    }
}
