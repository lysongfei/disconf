package com.baidu.disconf2.web.service.user.service.impl;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.baidu.disconf2.web.service.user.dao.UserDao;
import com.baidu.disconf2.web.service.user.dto.Visitor;
import com.baidu.disconf2.web.service.user.service.UserInnerMgr;
import com.baidu.ub.common.log.AopLogFactory;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserInnerMgrImpl implements UserInnerMgr {

    protected final static Logger LOG = AopLogFactory
            .getLogger(UserMgrImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public Visitor getVisitor(Integer userId) {

        if (userId == null || userId <= 0) {
            LOG.error("userId is null or <= 0, return null");
            return null;
        }

        return null;
    }

}