package com.wisrc.webapp.service.impl;

import com.wisrc.webapp.dao.UserInfoDao;
import com.wisrc.webapp.entity.UserInfoEntity;
import com.wisrc.webapp.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public List<UserInfoEntity> getAll() {
        return userInfoDao.getAll();
    }
}
