package com.spring_boot_expert.springbootexpert.dtos;

public class TokenDTO {

    private String usuario;
    private String token;

    public TokenDTO() {
    }

    public TokenDTO(String usuario, String token) {
        this.usuario = usuario;
        this.token = token;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
