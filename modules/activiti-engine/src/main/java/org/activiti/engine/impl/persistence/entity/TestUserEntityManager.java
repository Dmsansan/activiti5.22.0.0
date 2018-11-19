package org.activiti.engine.impl.persistence.entity;

import org.activiti.engine.impl.persistence.AbstractManager;

public class TestUserEntityManager extends AbstractManager {

    public TestUserEntity selectByPrimaryKey(Integer id){
        return (TestUserEntity) getDbSqlSession().selectOne("selectByPrimaryKey",id);
    }
}
