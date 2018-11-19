package org.activiti.engine.impl.persistence.entity;

import org.activiti.engine.impl.db.PersistentObject;

import java.io.Serializable;

public class TestUserEntity implements Serializable, PersistentObject {
    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public Object getPersistentState() {
        return null;
    }
}
