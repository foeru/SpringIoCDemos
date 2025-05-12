package com.foeru.ioc.containeroverview.dao;

public interface AccountDao {
    void saveAccount(String account);
    String getAccount(String accountId);
}