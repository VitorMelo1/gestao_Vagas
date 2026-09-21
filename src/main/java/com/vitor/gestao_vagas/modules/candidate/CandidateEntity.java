package com.vitor.gestao_vagas.modules.candidate;

import java.util.UUID;

import lombok.Data;

@Data
public class CandidateEntity {
    private UUID id;
    private String username;
    private String email;
    private String name;
    private String password;
    private String description;
    private String curriuculum;

}
