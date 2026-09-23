package com.vitor.gestao_vagas.excepitions;
public class UserFoundException extends RuntimeException {
    public UserFoundException(){
        super("Usuario ja existe");
    }
}
