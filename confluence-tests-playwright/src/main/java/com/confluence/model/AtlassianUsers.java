package com.confluence.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


public enum AtlassianUsers {
    USER("testerqajava@gmail.com", "SavePassword!");

    private final String userName;
    private final String password;


    private AtlassianUsers(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
