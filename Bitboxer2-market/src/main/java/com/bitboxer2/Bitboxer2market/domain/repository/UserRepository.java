package com.bitboxer2.Bitboxer2market.domain.repository;

public interface UserRepository {
    String getPasswordByUserName(String nombre);
    Integer getIdByUserName(String nombre);
}
