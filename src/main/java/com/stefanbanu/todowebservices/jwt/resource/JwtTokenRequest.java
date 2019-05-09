package com.stefanbanu.todowebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {

  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    String getUsername() {
        return this.username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    String getPassword() {
        return this.password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
}
